package lesson08.tasks_08_03;

import java.util.Arrays;

/*
Класс должен иметь следующие возможности (реализованные как методы):
● Поставить оценку любому студенту за любое занятие (по номеру занятия).
● Распечатать все оценки всех студентов за одно занятие (по номеру)
● Распечатать все оценки всех студентов за весь курс
● Посчитать средний балл любого студента.
 */
public class ClassJournal {
    public String[] studentsNames;
    public int[][] grades;
    public int numberOfClasses;

    ClassJournal(String[] studentsNames, int numberOfClasses) {
        this.studentsNames = studentsNames;
        this.grades = new int[studentsNames.length][numberOfClasses];
        this.numberOfClasses = numberOfClasses;
    }

    public static String formatName(String name) {
        int targetLength = 20;
        StringBuilder formattedName = new StringBuilder(name);
        while (formattedName.length() < targetLength) {
            formattedName.append('.');
        }
        return formattedName.toString();
    }

    public int findStudentIndex(String studentName) {
        if (studentName.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < studentsNames.length; i++) {
            if (studentName.equals(studentsNames[i])) {
                return i;
            }
        }
        return -1;
    }

    public void setGrade(String studentName, int classNumber, int grade) {
        int studentIndex = findStudentIndex(studentName);
        grades[studentIndex][classNumber - 1] = grade;
    }

    public int getGradeForClass(String studentName, int classNumber) {
        int studentIndex = findStudentIndex(studentName);
        return grades[studentIndex][classNumber - 1];
    }

    public int[] getGradeAll(String studentName) {
        int studentIndex = findStudentIndex(studentName);
        return grades[studentIndex];
    }

    public void printGradesForClass(int classNumber) {
        System.out.println("Оценки за занятие " + classNumber + ":");
        for (String studentName : studentsNames) {
            System.out.println(formatName(studentName) + getGradeForClass(studentName, classNumber));
        }
        System.out.println();
    }

    public void printAllGrades() {
        System.out.println("Оценки всех студентов за весь курс:");
        for (String studentName : studentsNames) {
            System.out.println(formatName(studentName) + (Arrays.toString(getGradeAll(studentName))).replace("[", "").replace("]", ""));
        }
        System.out.println();
    }

    public void getAverageGrade(String studentName) {
        int studentIndex = findStudentIndex(studentName);
        int result = 0;
        for (int grade: grades[studentIndex]) {
            result += grade;
        }
        System.out.println("Средняя оценка за курс студента " + formatName(studentName) + 1.0 * result / numberOfClasses);
    }

}
