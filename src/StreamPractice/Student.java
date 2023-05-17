package StreamPractice;

public class Student {
    private int studentId;
    private String stdName;

    public Student(int studentId, String stdName) {
        this.studentId = studentId;
        this.stdName = stdName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }
}
