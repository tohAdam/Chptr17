import java.util.Scanner;

public class TrashDumpCharge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int BASE_WEIGHT_LIMIT = 200;
        final double BASE_CHARGE = 20.0;
        final double ADDITIONAL_CHARGE_PER_100_POUNDS = 8.0;

        System.out.print("Enter the weight of the trash load (in pounds): ");
        int weight = scanner.nextInt();
        double charge;
        
      if (weight <= BASE_WEIGHT_LIMIT) 
            charge = BASE_CHARGE;
      else {
            int additionalWeight = weight - BASE_WEIGHT_LIMIT;
            int additionalHundreds = (int) Math.ceil((double) additionalWeight / 100);
            charge = BASE_CHARGE + additionalHundreds * ADDITIONAL_CHARGE_PER_100_POUNDS;
        } System.out.println("The charge for disposing of " + weight + " pounds of trash is: $" + charge);
    }
}
