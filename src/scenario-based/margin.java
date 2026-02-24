import java.util.*;
        import java.util.stream.*;
        import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;

class Enrollment {
    private String studentName;
    private String courseName;
    private String category;

    public Enrollment(String studentName, String courseName, String category) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.category = category;
    }

    public String getStudentName() {

        return studentName;
    }

    public String getCourseName() {

        return courseName;
    }

    public String getCategory() {

        return category;
    }
}

public class margin {

    public static void main(String[] args) {

        List<Enrollment> enrollments = Arrays.asList(
                new Enrollment("Amit", "Java Basics", "Java"),
                new Enrollment("Ravi", "Advanced Java", "Java"),
                new Enrollment("Neha", "Advanced Java", "Java"),
                new Enrollment("Pooja", "Spring Boot", "Java"),
                new Enrollment("Karan", "Advanced Java", "Java"),
                new Enrollment("Amit","java","java")
        );

        // Filter Java category
        List<Enrollment> javaEnrollments = enrollments.stream()
                .filter(e -> e.getCategory().equalsIgnoreCase("Java"))
                .collect(Collectors.toList());

        System.out.println("Filtered Category: Java");
        System.out.println("Total Enrollments: " + javaEnrollments.size());

        // Find most popular course
        String mostPopularCourse = enrollments.stream()
                .collect(Collectors.groupingBy(
                        Enrollment::getCourseName,
                        Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Most Popular Course: " + mostPopularCourse);
    }

    // JUnit Test Case
    @Test
    void testJavaEnrollmentCount() {
        List<Enrollment> enrollments = Arrays.asList(
                new Enrollment("A", "Advanced Java", "Java"),
                new Enrollment("B", "Spring Boot", "Java"),
                new Enrollment("C", "Python", "Python")
        );

        long count = enrollments.stream()
                .filter(e -> e.getCategory().equals("Java"))
                .count();

        assertEquals(2, count);
    }
}


//List<Enrollment> programmingCourses =
//        enrollments.stream()
//                .filter(e -> e.getCategory().equalsIgnoreCase("Programming"))
//                .collect(Collectors.toList());
//
//Map<String, Long> countByCategory =
//        enrollments.stream()
//                .collect(Collectors.groupingBy(
//                        Enrollment::getCategory,
//                        Collectors.counting()
//                ));
//List<Enrollment> result =
//        enrollments.stream()
//                .filter(e -> e.getCategory().equals("Programming"))
//                .sorted(Comparator.comparing(Enrollment::getEnrollmentDate))
//                .collect(Collectors.toList());
