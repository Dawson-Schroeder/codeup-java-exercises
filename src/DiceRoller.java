import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rollAgain = true;

        while (rollAgain) {
            int numSides = getNumSides(scanner);
            int roll1 = rollDice(numSides);
            int roll2 = rollDice(numSides);
            System.out.println("You rolled a " + roll1 + " and a " + roll2 + ".");
            rollAgain = askToRollAgain(scanner);
        }

        scanner.close();
    }

    public static int getNumSides(Scanner scanner) {
        System.out.print("Enter the number of sides for a pair of dice: ");
        return scanner.nextInt();
    }

    public static int rollDice(int numSides) {
        return (int) (Math.random() * numSides) + 1;
    }

    public static boolean askToRollAgain(Scanner scanner) {
        System.out.print("Roll again? (y/n): ");
        String input = scanner.next();
        return input.equalsIgnoreCase("y");
    }

}

