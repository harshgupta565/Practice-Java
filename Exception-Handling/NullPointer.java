public class NullPointer {
    public static void main(String[] args) {
        String str = null;
        try {
            int n =str.length(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            //e.printStackTrace();
        }

        System.out.println("Program continues...");
    }
}
