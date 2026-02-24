package Strings.L2;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str = "Hello World";
        String rev = "";
        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
           StringBuilder builder = new StringBuilder(words[i]);
           rev += builder.reverse()+" ";
        }
        System.out.println(rev);
    }
}
