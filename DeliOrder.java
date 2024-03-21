import java.util.Scanner;

public class DeliOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the item: ");
        String item = scan.nextLine();

        System.out.print("Enter the price: ");
        double price = scan.nextDouble();

        System.out.print("Overnight delivery (0==no, 1==yes): ");
        int expressDelivery = scan.nextInt();
        double deliveryCharge = (price >= 10.00) ? 0.00 : 2.00;
       
      if (expressDelivery == 1) 
            deliveryCharge += 3.00;
      
        double totalAmount = price + deliveryCharge;

        System.out.println("\nInvoice:");
        System.out.printf("  %s    %.2f%n", item, price);
        System.out.printf("  delivery      %.2f%n", deliveryCharge);
        System.out.printf("  total         %.2f%n", totalAmount);
    }
}
