import java.util.Scanner;

public class SteamEngineEfficiency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter the air temperature (in Kelvin): ");
        double Tair = scan.nextDouble();

        System.out.print("Enter the steam temperature (in Kelvin): ");
        double Tsteam = scanner.nextDouble();
        double efficiency;
       
      if (Tsteam < 373.0) 
            efficiency = 0.0; // No steam, efficiency is zero
      else 
            efficiency = 1.0 - (Tair / Tsteam);
      
        System.out.println("Maximum possible efficiency of the steam engine: " + efficiency);
    }
}
