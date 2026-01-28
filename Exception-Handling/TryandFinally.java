public class TryandFinally {
    public static int test(){
        try{
            return 10;
        }
        finally{
            return 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
// finally humesha try ke return ko override kr leta hh
