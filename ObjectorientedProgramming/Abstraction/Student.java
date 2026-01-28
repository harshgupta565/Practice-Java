package Abstraction;
abstract class name{
    abstract void register();
}
 class Data  extends name {
    private int id;
   private String Student;
    void register(){
        System.out.println("registration has not start yet ");
    }

    public String getStudent() {
        return Student;
    }

    public int getId(int id ) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudent(String student) {
        Student = student;
    }
}

public class Student {
    public static void main(String[] args) {
     Data data = new Data();
        System.out.println( data.getId(152));

    }
}