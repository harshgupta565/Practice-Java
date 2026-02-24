package Practice;

import java.util.Scanner;

class Wind{
   void  calculateWindChill(double temperature, double windspeed) {
        double windChill = 35.74 + 0.6215 * (temperature) + (0.4275*(temperature) - 35.75) * Math.pow( windspeed , 0.16 );
       System.out.println(windChill);
   }
}
public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  temperature = sc.nextInt();
        double windspeed  = sc.nextInt();
        Wind wind = new Wind();
        wind.calculateWindChill(temperature, windspeed);
    }
}
