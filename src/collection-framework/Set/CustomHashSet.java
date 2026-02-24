import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Students{
    int id;
    String name;

    public Students(int id , String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class CustomHashSet {
    public static void main(String[] args) {
        Set<Students> students = new HashSet<>();
        students.add(new Students(1,"Amit"));
        students.add(new Students(2,"Harsh"));
        System.out.println(students);
    }
}
