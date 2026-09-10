import java.util.InputMismatchException;
import java.util.Scanner;

public class BusTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int availableSeats = 50;

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age <= 0) {
                throw new IllegalArgumentException("Invalid age");
            }

            System.out.print("Enter number of seats: ");
            int seats = sc.nextInt();

            if (seats <= 0) {
                throw new IllegalArgumentException("Invalid number of seats");
            }

            if (seats > availableSeats) {
                throw new ArithmeticException("Insufficient seats");
            }

            System.out.println("Booking Successful");
            System.out.println("Age: " + age);
            System.out.println("Seats booked: " + seats);
            System.out.println("Remaining seats: " + (availableSeats - seats));

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}