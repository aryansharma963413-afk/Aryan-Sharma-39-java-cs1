import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        double balance = 10000;

        int attempts = 0;
        boolean authenticated = false;

        while (attempts < 3) {

            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                authenticated = true;
                System.out.println("PIN verified successfully.");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");

                if (attempts < 3) {
                    System.out.println("Attempts remaining: " + (3 - attempts));
                }
            }
        }

        if (!authenticated) {
            System.out.println("Maximum incorrect attempts reached.");
            System.out.println("Account blocked.");
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAmount <= balance) {
                        balance = balance - withdrawAmount;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();

                    balance = balance + depositAmount;
                    System.out.println("Deposit successful.");
                    break;

                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}