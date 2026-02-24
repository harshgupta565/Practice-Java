package Practice.Employee;

import java.util.LinkedList;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Dept: " + department +
                ", Salary: " + salary);
    }
}

public class EmployeeManagemnt {

    static LinkedList<Employee> list = new LinkedList<>();

    // Add Employee
    public static void addEmployee(int id, String name, String dept, double salary) {
        list.add(new Employee(id, name, dept, salary));
        System.out.println("Employee Added");
    }

    // Delete by ID
    public static void deleteEmployee(int id) {
        for (Employee e : list) {
            if (e.id == id) {
                list.remove(e);
                System.out.println("Employee Deleted");
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    // Search by ID
    public static void searchEmployee(int id) {
        for (Employee e : list) {
            if (e.id == id) {
                System.out.println("Employee Found:");
                e.display();
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    // Display All
    public static void displayAll() {
        for (Employee e : list) {
            e.display();
        }
    }

    public static void main(String[] args) {

        addEmployee(101, "Harsh", "IT", 50000);
        addEmployee(102, "Riya", "HR", 45000);

        displayAll();

        searchEmployee(101);

        deleteEmployee(102);

        displayAll();
    }
}