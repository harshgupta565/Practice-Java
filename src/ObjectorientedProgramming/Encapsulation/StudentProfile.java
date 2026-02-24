package ObjectorientedProgramming.Encapsulation;
class Student{
    private  int rollnumber;
    private String name  ;
    private int marks;
    public int  getrollnumber(){
      return rollnumber;
    }
    public void   getname(){
        System.out.println(name);
    }
    public int marks(){
        return marks;
    }

    public void setMarks(int marks) {
        this.marks=marks;
    }
    public void setname(String name) {
        this.name = name;
    }
}
public class StudentProfile {
    public static void main(String[] args) {
        Student student = new Student();
//        student.getname();
//        student.getname();
        student.setname("harsh");
    }
}
