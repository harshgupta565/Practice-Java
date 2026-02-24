package Lpu.StudentRecordManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ================== Custom Exceptions ==================
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

// ================== Abstract Class ==================
abstract class BankAccount {

    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientBalanceException;
}

// ================== Savings Account ==================
class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }

        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        balance -= amount;
    }
}

// ================== Bank Service ==================
class BankService {

    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount findAccount(int accountNumber)
            throws AccountNotFoundException {

        return accounts.stream()
                .filter(acc -> acc.getAccountNumber() == accountNumber)
                .findFirst()
                .orElseThrow(() ->
                        new AccountNotFoundException("Account not found"));
    }

    public void transfer(int fromAcc, int toAcc, double amount)
            throws AccountNotFoundException, InsufficientBalanceException {

        BankAccount sender = findAccount(fromAcc);
        BankAccount receiver = findAccount(toAcc);

        sender.withdraw(amount);
        receiver.deposit(amount);
    }

    public double getTotalBankBalance() {
        return accounts.stream()
                .mapToDouble(BankAccount::getBalance)
                .sum();
    }
}

// ================== Main ==================
public class BankLpu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        try {

            System.out.print("Enter number of accounts: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {

                System.out.println("\nEnter details for account " + (i + 1));

                System.out.print("Account Number: ");
                int accNo = sc.nextInt();
                sc.nextLine();

                System.out.print("Account Holder Name: ");
                String name = sc.nextLine();

                System.out.print("Initial Balance: ");
                double balance = sc.nextDouble();

                service.addAccount(new SavingsAccount(accNo, name, balance));
            }

            System.out.println("\n--- Transfer Money ---");

            System.out.print("From Account Number: ");
            int from = sc.nextInt();

            System.out.print("To Account Number: ");
            int to = sc.nextInt();

            System.out.print("Amount to Transfer: ");
            double amount = sc.nextDouble();

            service.transfer(from, to, amount);

            System.out.println("\nTransfer Successful!");

            System.out.println("\n--- Updated Balances ---");
            System.out.println("Total Bank Balance: " + service.getTotalBankBalance());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
