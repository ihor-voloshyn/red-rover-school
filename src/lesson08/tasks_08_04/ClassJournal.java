package lesson08.tasks_08_04;

/*
Класс должен иметь следующие возможности (реализованные как методы):
● Поставить оценку любому студенту за любое занятие (по номеру занятия).
● Распечатать все оценки всех студентов за одно занятие (по номеру)
● Распечатать все оценки всех студентов за весь курс
● Посчитать средний балл любого студента.
 */
public class ClassJournal {
    private static StudentGrades[] studentGrades;
    private static int sessionsNumber;

    public static void setStudentGrades(StudentGrades[] studentGrades) {
        ClassJournal.studentGrades = studentGrades;
    }

    public static void setSessionsNumber(int sessionsNumber) {
        ClassJournal.sessionsNumber = sessionsNumber;
    }

    public static String formatName(String name, String separator, int length) {
        StringBuilder formattedName = new StringBuilder(name);
        while (formattedName.length() < length) {
            formattedName.append(separator);
        }
        return formattedName.toString();
    }

    public int findStudentIndex(String studentName) {
        if (studentName.isEmpty() || studentGrades.length == 0) {
            System.out.println("Error: name or array is empty.");
            return -1;
        }
        for (int i = 0; i < studentGrades.length; i++) {
            if (studentGrades[i].getStudentName().equals(studentName)) {
                return i;
            }
        }
        return -1;
    }

    public void setGrade(String studentName, int sessionNumber, int grade) {
        studentGrades[findStudentIndex(studentName)].setGradeSession(sessionNumber, grade);
    }

    public int getGradeForSession(String studentName, int sessionNumber) {
        return studentGrades[findStudentIndex(studentName)].getGradeForSession(sessionNumber);
    }

    public Integer[] getGradeAll(String studentName) {
        return studentGrades[findStudentIndex(studentName)].getGrades();
    }
/*
    public void printGradesForClass(int classNumber) {
        System.out.println("Оценки за занятие " + formatName(String.valueOf(classNumber), " ", 2) + ":");
        for (String studentName : studentsNames) {
            System.out.println(formatName(studentName, ".", 20) + getGradeForClass(studentName, classNumber));
        }
        System.out.println();
    }

    public void printAllGrades() {
        System.out.println("Оценки всех студентов за весь курс:");
        for (String studentName : studentsNames) {
            System.out.println(formatName(studentName, ".", 20) + (Arrays.toString(getGradeAll(studentName))).replace("[", "").replace("]", ""));
        }
        System.out.println();
    }

    public void getAverageGrade(String studentName) {
        int studentIndex = findStudentIndex(studentName);
        int result = 0;
        for (int grade : grades[studentIndex]) {
            result += grade;
        }
        System.out.println("Средняя оценка за курс студента " + formatName(studentName, ".", 20) + 1.0 * result / numberOfClasses);
    }*/
}
