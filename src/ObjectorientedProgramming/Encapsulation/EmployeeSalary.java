package ObjectorientedProgramming.Encapsulation;
class   Employee{
    private int empid;
    private double salary;

    public void setSalary(double salary) {
        if(salary >0) {
            this.salary = salary;
        }
    }
    public double getSalary(){
        return salary;
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(5200.6);
        System.out.println("salary earned " +employee.getSalary());
    }
}
