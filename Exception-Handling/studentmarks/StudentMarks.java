package studentmarks;
class Result{
    class SomethingWrong extends Exception{
        public SomethingWrong(String message){
            super(message);
        }
    }
    void markschecker(int marks) throws SomethingWrong {
        if(marks<0){
            throw  new SomethingWrong(" you failed ");
        }
        if (marks>100){
            throw new SomethingWrong("there might be something wrong ");
        }
        System.out.println("You got "+marks+" marks ");
    }
}

public class StudentMarks {
    public static void main(String[] args) {
         Result result = new Result();
         try{
             result.markschecker(-1);
         }catch (Result.SomethingWrong e){
             System.out.println(e);

         }
    }
}
