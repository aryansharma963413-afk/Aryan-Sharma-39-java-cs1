
import java.util.Scanner;

public class OnlineShoppingPayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            if (price <= 0) {
                throw new IllegalArgumentException("Invalid product price");
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new IllegalArgumentException("Invalid quantity");
            }

            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();

            if (discount < 0 || discount > 100) {
                throw new IllegalArgumentException("Invalid discount percentage");
            }

            double total = price * quantity;
            double discountAmount = total * discount / 100;
            double bill = total - discountAmount;

            System.out.println("Final Bill: " + bill);

            System.out.print("Enter payment amount: ");
            double payment = sc.nextDouble();

            if (payment < bill) {
                throw new ArithmeticException("Payment amount is less than the bill");
            }

            System.out.println("Payment successful");
            System.out.println("Change: " + (payment - bill));

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}