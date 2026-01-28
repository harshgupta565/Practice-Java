package Encapsulation;
class StudentsM{
    private String Name ;
    private int marks;

    public void setMarks(int marks){
        if (marks >= 0 && marks <= 100){
            this.marks=marks;
        }
    }
    public  int getMarks(){
        return marks;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
}
public class StudentMarks {
    public static void main(String[] args) {
        StudentsM student = new StudentsM();
        student.setMarks(85);
        System.out.println(student.getMarks());
        student.setName("Harsh");
        System.out.println(student.getName());
    }
}
