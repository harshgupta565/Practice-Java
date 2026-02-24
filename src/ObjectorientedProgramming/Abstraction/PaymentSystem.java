package ObjectorientedProgramming.Abstraction;

 abstract class Payemt{
    abstract void pay(double amount);
    void printReceipt(){
        System.out.println("print Reciept ");
    }
}
class CreditCardPayment extends Payemt {
    @Override
    void pay(double amount) {
        System.out.println("use card for payment " + amount);
    }
}
    class UPIPayment extends Payemt{
        void pay(double amount){
            System.out.println("use scanner for payment " + amount);
        }
    }

public class PaymentSystem {
    public static void main(String[] args) {
        Payemt Pay = new CreditCardPayment();
        Pay.pay(152);
        Payemt  p = new UPIPayment();
        p.pay(5658);

    }
}
