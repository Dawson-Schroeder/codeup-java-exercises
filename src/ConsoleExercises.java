import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int userInputInteger = scanner.nextInt();

        System.out.print("Enter the first word: ");
        String wagon = scanner.nextLine();
        String firstWord = scanner.nextLine();
        System.out.print("Enter the second word: ");
        String secondWord = scanner.nextLine();
        System.out.print("Enter the third word: ");
        String thirdWord = scanner.nextLine();
        System.out.println("You entered:");
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        System.out.println("Please enter your favorite quote");
        String quote = scanner.nextLine();
        System.out.println("This quote?: " + quote);

        System.out.println("what is the length?");
        int lengthInput = scanner.nextInt();
        System.out.println("What is the width?");
        int widthInput = scanner.nextInt();
        int calcArea = lengthInput * widthInput;
        System.out.println("The area of the room you described is " + calcArea);
        int calcPerimeter = lengthInput + lengthInput + widthInput + widthInput;
        System.out.println("The perimeter of the room is" + calcPerimeter);

    }
}
