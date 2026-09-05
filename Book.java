import java.util.Scanner;

public class Book {

    int bookId;
    String bookTitle;
    String author;
    boolean available;

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    void displayBook() {
        System.out.println("\n----- Book Details -----");
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (available ? "Available" : "Issued"));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book book = new Book();

        System.out.print("Enter Book ID: ");
        book.bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        book.bookTitle = sc.nextLine();

        System.out.print("Enter Author: ");
        book.author = sc.nextLine();

        book.available = true;

        book.displayBook();

        System.out.print("\nDo you want to issue the book? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            book.issueBook();
        }

        book.displayBook();

        sc.close();
    }
}