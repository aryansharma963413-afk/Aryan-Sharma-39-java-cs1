import java.util.Scanner;

public class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    double calculateTotalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product();

        product.productId = id;
        product.productName = name;
        product.price = price;
        product.quantity = quantity;

        double totalCost = product.calculateTotalCost();

        System.out.println("\n----- Product Details -----");
        System.out.println("Product ID: " + product.productId);
        System.out.println("Product Name: " + product.productName);
        System.out.println("Price: " + product.price);
        System.out.println("Quantity: " + product.quantity);
        System.out.println("Total Cost: " + totalCost);

        double totalBill = totalCost;
        double discount = 0;

        if (totalBill > 5000) {
            discount = totalBill * 0.10;
        }

        double finalBill = totalBill - discount;

        System.out.println("\n----- Bill Details -----");
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalBill);

        sc.close();
    }
}
