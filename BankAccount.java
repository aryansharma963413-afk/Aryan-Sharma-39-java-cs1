import java.util.Scanner;

public class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter account number: ");
        account.accountNumber = sc.nextLine();

        System.out.print("Enter account holder name: ");
        account.accountHolderName = sc.nextLine();

        System.out.print("Enter initial balance: ");
        account.balance = sc.nextDouble();

        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Account Holder: " + account.accountHolderName);

        account.displayBalance();

        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();

        account.deposit(depositAmount);
        account.displayBalance();

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();

        account.withdraw(withdrawAmount);
        account.displayBalance();

        sc.close();
    }
}