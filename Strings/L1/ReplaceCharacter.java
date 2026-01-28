package L1;

public class ReplaceCharacter {
    public static void main(String[] args) {
      String   Str1 = " abc";
      for (int i = 0; i < Str1.length(); i++) {
          if(Str1.charAt(i)=='b'){
              Str1.replace(Str1.charAt(i),'z');
          }
      }
        System.out.println(Str1);
    }
}
