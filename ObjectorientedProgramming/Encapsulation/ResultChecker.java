package Encapsulation;

class StudentData {
    private int studentId;
    private String studentName;
    private int marks;
    private boolean isPassed;

    // Setter methods
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMarks(int marks) {
        this.marks = marks;
        if (marks >= 40) {
            isPassed = true;
        } else {
            isPassed = false;
        }
    }

    // Getter method
    public boolean isPassed() {
        return isPassed;
    }
}

public class ResultChecker {
    public static void main(String[] args) {
        StudentData studentData = new StudentData();

        studentData.setStudentId(5452);
        studentData.setStudentName("Harshit");
        studentData.setMarks(66);

        System.out.println("Passed: " + studentData.isPassed());
    }
}
