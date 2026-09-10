import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccountWithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 10000;

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid withdrawal amount");
            }

            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance");
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful");
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
        