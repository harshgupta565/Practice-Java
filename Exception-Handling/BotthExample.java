public class BotthExample {

    // Method declares exception using throws
    static void checkAge(int age) throws ArithmeticException {

        // Manually throwing exception using throw
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
