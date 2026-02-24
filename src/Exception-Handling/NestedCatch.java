public class NestedCatch{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer");
        }
    }
}
