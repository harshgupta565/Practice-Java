class Userdataset {
    int id = 1255;
    String Username = "abc";
    class InvalidLoginException extends Exception{
        public InvalidLoginException(String message){
            super(message);
        }
    }
    void datacheck(String loginUsername , int loginid ) throws InvalidLoginException{
        if (!loginUsername.equals(Username)){
            throw new InvalidLoginException("there is something wrong in your username ");
        }
        if(id != loginid ){
            throw new InvalidLoginException("you are not logged in");
        }
        System.out.println("Congratualtion You Logged in Succesfully ");
    }
}
public class YoutubeLogin {
    public static void main(String[] args) {
    Userdataset user = new Userdataset();

    try{
        user.datacheck("non",553);
    }catch (Userdataset.InvalidLoginException e){
        System.out.println(e);
    }
    }
}


