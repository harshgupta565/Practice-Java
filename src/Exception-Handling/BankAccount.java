class Account{
    int balance  = 5000;
    class  NoMoneyException extends Exception{
        public NoMoneyException(String message){
            super(message);
        }
    }
    void withdraw (int amount) throws NoMoneyException{
        if(amount > balance ){
            throw  new NoMoneyException("Not enough money");
        }
        balance = balance - amount;
        System.out.println("money deducted properly  , Money remainng :" + balance );
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Account a = new Account();
        try{
             a.withdraw(200);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


//class BankAccount {
//
//    int balance = 5000;
//
//    // Step 1: Custom Exception
//    class NoMoneyException extends Exception {
//        public NoMoneyException(String message) {
//            super(message);
//        }
//    }
//
//    // Step 2: Method jaha exception throw hoga
//    void withdraw(int amount) throws NoMoneyException {
//        if (amount > balance) {
//            throw new NoMoneyException("No money! Insufficient balance");
//        }
//        balance = balance - amount;
//        System.out.println("Withdrawal successful. Remaining balance: " + balance);
//    }
//
//    // Step 3: main method
//    public static void main(String[] args) {
//
//        BankAccount acc = new BankAccount();
//
//        try {
//            acc.withdraw(6000);
//        } catch (NoMoneyException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//    }
//}
