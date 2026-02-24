package Practice;

import java.util.Scanner;

class validator{

}
public class Paragraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        int maxlength = 0;
        String [] strArr = str.split(" ");
        System.out.println("The number of Words "+strArr.length);
  for(int i=0;i<strArr.length;i++){
      int length =strArr[i].length();
      if(length > maxlength){
          maxlength = length;
      }
      String replaced  = strArr[i].replaceAll("a","z");
      System.out.println(replaced);
  }
        System.out.println(maxlength);

    }
}
