package lesson08.tasks_08_03;

import java.util.Arrays;

/*
Задача №3
(на подумать, сложная)
Я читаю студентам некий курс, состоящий из 10 занятий. Мне нужен класс, который
представляет собой классный журнал. Этот журнал содержит список студентов (фамилии
придумайте сами) и “клеточки” для выставления оценок (подсказка — как лучше хранить
имя студента и все его оценки вместе?)
Класс должен иметь следующие возможности (реализованные как методы):
● Поставить оценку любому студенту за любое занятие (по номеру занятия).
● Распечатать все оценки всех студентов за одно занятие (по номеру)
● Распечатать все оценки всех студентов за весь курс
● Посчитать средний балл любого студента.
 */
public class ATaskRunner {
    public static void main(String[] args) {

        String[] students = {"Иванов", "Петров", "Сидоров"};
        ClassJournal journal = new ClassJournal(students, 10);

        journal.setGrade("Иванов", 1, 5);
        journal.setGrade("Петров", 1, 3);
        journal.setGrade("Сидоров", 1, 4);

        journal.setGrade("Иванов", 2, 4);
        journal.setGrade("Сидоров", 2, 5);

        journal.setGrade("Иванов", 3, 4);
        journal.setGrade("Петров", 3, 5);
        journal.setGrade("Сидоров", 3, 5);

        journal.printGradesForClass(3);
        journal.printAllGrades();
        journal.getAverageGrade("Иванов");
        journal.getAverageGrade("Петров");
        journal.getAverageGrade("Сидоров");


    }
}
