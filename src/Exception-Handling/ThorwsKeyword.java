import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThorwsKeyword {
    public static void main(String[] args) throws FileNotFoundException {
        methhod2();
        System.out.println("Hello");
    }
    // agr me thorws htaa do to error ayegaa kyuki method 2 method 1 extend kr rha hh  aur method 1 throw kiya apna khudka exception
    public static void methhod2() throws FileNotFoundException {
        methhod1();
    }
    public static void methhod1() throws FileNotFoundException {
        try {
            FileReader fr = new FileReader("a.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new FileNotFoundException("Something is really wrong here ");
        }
    }
}
// bhai dhek me btao yhaa kya hua , method 1 me  user generated thorws  se exception declare karaya hh aur throw se  user generated exception throw kiya hh
//file reader io file not found exception anaa chaiye thaa
