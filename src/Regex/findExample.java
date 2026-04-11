package Regex;
import java.util.regex.*;
public class findExample {
    public static void main(String[] args) {
        String str = "MY Name is Harsh ";
        Pattern p = Pattern.compile("Harsh");
        Matcher m = p.matcher(str);
        boolean b = m.find();
        if(b){
            System.out.println("match found");
        }
        else{
            System.out.println("match not found");
        }
    }
}
