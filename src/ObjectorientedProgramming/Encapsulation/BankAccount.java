package ObjectorientedProgramming.Encapsulation;
class BankDetails{
    private int accountnumber;
    private double balance;

    public  void   deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        }
    }
        public double getbalance(){
            return balance;
        }

}
public class BankAccount {
    public static void main(String[] args) {
      BankDetails bankdetails = new BankDetails();
      bankdetails.deposit(5000);
        System.out.println("Total balance of account "+bankdetails.getbalance());

    }
}
