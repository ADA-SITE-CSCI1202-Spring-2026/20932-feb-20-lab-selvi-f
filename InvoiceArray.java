import java.util.Scanner;

class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity < 0 ? 0 : quantity;
        this.price = price < 0 ? 0.0 : price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }

    public String toString() {
        return "Part No: " + number +
               "\nDescription: " + description +
               "\nQuantity: " + quantity +
               "\nPrice per Item: " + price +
               "\nInvoice Amount: " + getInvoiceAmount();
    }
}

public class InvoiceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = input.nextInt();
        input.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part Number: ");
            String number = input.nextLine();

            System.out.print("Description: ");
            String desc = input.nextLine();

            System.out.print("Quantity: ");
            int qty = input.nextInt();

            System.out.print("Price per item: ");
            double price = input.nextDouble();
            input.nextLine();

            invoices[i] = new Invoice(number, desc, qty, price);
        }

        System.out.println("\n Invoice Details ");
        for (Invoice inv : invoices) {
            System.out.println(inv);
        }
    }
}