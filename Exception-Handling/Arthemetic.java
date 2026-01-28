public class Arthemetic {
    public static void main(String[] args) {
        // Exception -Handling Example
//        int a = 10;
//        int b = 0;
//        System.out.println(a/b);
         try {
         int a = 10 ;
         int b = 0;
             System.out.println(a/b);
         }
         // e is creating obejct to store the exception .
         catch (ArithmeticException e){
             System.out.println("Arthemetic Exception");
         }
         finally{
             System.out.println("Arthemetic runs finally");
         }
         }
    }

