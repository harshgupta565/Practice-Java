package Generics;

import java.util.ArrayList;

public class ProblemWithoutGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
       list.add("Hello");
       list.add(123);
       list.add(32.5);
       list.add("World");
        String str = (String ) list.get(0);
        // So there is the need of casting there this the basic problem in ti
       // the problem in this is we can add any varible type datatype in it . and there is no fixed rule for tha before genrics

    }
}
