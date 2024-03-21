import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many items to heat: ");
        int numItems = scan.nextInt();

        System.out.print("Time for one item: ");
        int timeForOneItem = scan.nextInt();
        int totalHeatingTime;
        if (numItems == 1) 
            totalHeatingTime = timeForOneItem;
         else if (numItems == 2) 
            totalHeatingTime = (int) (timeForOneItem * 1.5); // Add 50%
         else if (numItems == 3) 
            totalHeatingTime = timeForOneItem * 2; // Double the time
         else {
            System.out.println("Heating more than three items at once is not recommended.");
            return;
        } int minutes = totalHeatingTime / 60;
          int seconds = totalHeatingTime % 60;
      
        System.out.println("Heat for " + minutes + " minutes " + seconds + " seconds");
    }
}
