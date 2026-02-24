package VechileFine;

import java.util.HashMap;
import java.util.Map;

class InvalidVEchileException extends RuntimeException{
    public InvalidVEchileException(String message){
        super(message);
    }
}
public class vechile {
    int vechilenumber;
    String vechilename;
    String violationtype;
    Map<String,String> vechile = new HashMap<>();


}
