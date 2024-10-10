package lesson08.tasks_08_04;

public class StudentGrades {
    private String studentName;
    private Integer[] grades;

    Integer[] getGrades() {
        return grades;
    }

    Integer getGradeForSession(int sessionNumber) {
        return grades[sessionNumber - 1];
    }

    void setGradeSession(int sessionNumber, int grade) {
        this.grades[sessionNumber - 1] = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


}
