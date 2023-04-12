import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        // 1: main
        System.out.println(addition(2, 2));
        System.out.println(subtraction(2, 2));
        System.out.println(multiplication(2, 2));
        System.out.println(division(2, 2));
        System.out.println(modulus(10, 5));

//        // 2: main
        int number = getInterger(1, 10);

//        // 3: main
        int factorial = getFactorial(number);

//        // 4: main
        int diceSides = getDiceSide();
        System.out.println(rollDice(diceSides));
    }

    // 1:
    public static int addition(int x, int y){
        return x + y;
    }
    public static int subtraction(int x, int y){
        return x - y;
    }
    public static int multiplication(int x, int y){
        return x * y;
    }
    public static int division(int x, int y){
        return x / y;
    }
    public static int modulus(int x, int y) {
        return x % y;
    }


    // 2:
    public static int getInterger(int min, int max){
        System.out.println("Please enter a number between" + min + "and" + max + ":");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= min && num <= max){
            return num;
        } else {
            return getInterger(min, max);
        }
    }
    public static int getInteger2(Scanner scanner, int min, int max) {
        int number;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= min && number <= max) {
                    return number;
                }
            }
            System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ":");
            scanner.nextLine();
        }
    }

    // 3:
    public static int getFactorial(int num){
        int result = 1;
        for (int i = 1; i <= num; i++){
            result*=i;
        }
        return result;
    }


    // 4:
    public static int randomNumber(int min, int max){
        int result = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return result;
    }
    public static int getDiceSide() {
        int userChoice = getInterger(4, 20);
        return userChoice;
        }
    public static String rollDice(int sides) {
        System.out.println("Do you want to roll the dice? [y/N]");
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();
        if (userChoice.equalsIgnoreCase("y")) {
            int result1 = randomNumber(1, sides);
            int result2 = randomNumber(1, sides);
            return "The first dice rolled a " + result1 + "The second dice rolled a " + result2 + "The Total: " + (result1 + result2);
        } else {
            return rollDice(sides);
        }
    }




}


