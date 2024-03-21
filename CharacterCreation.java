import java.util.Scanner;

public class CharacterCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Yertle's Quest");
        System.out.print("Enter the name of your character: ");
        String name = scan.nextLine();

        System.out.print("Enter strength (1-10): ");
        int strength = scan.nextInt();

        System.out.print("Enter health (1-10): ");
        int health = scan.nextInt();

        System.out.print("Enter luck (1-10): ");
        int luck = scan.nextInt();
        int totalPoints = strength + health + luck;
        
      if (totalPoints > 15) {
            System.out.println("You have given your character too many points! Default values have been assigned:");
            strength = health = luck = 5;
        }
        System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
    }
}
