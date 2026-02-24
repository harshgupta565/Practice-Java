package Practice;

import java.util.Scanner;

class Cal{
   void findAverageMinMax( int [] arr){
       double sum = 0;
       for(int i=0;i<arr.length-1;i++){
           int  max = Math.min(arr[i],arr[i+1]);
           int  min = Math.max(arr[i],arr[i+1]);
            sum = sum   + arr[i];
           System.out.println(max+","+min +","+ sum );
       }
   }
}
public class Random {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int    [] arr = new int  [size];
     for (int i = 0; i < size; i++){
         arr[i] = (int )Math.random()+1;
     }
     Cal cal = new Cal();
     cal.findAverageMinMax(arr);
    }
}
