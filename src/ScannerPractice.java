import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userName = scanner.next();
//        System.out.println("Hello, " + userName);
//        System.out.println("What is your full name");
//        String nextLine = scanner.nextLine();
//        String fullName = scanner.nextLine();
//        System.out.println("Hi, " + fullName);

        System.out.println("Please enter an integer: ");
        int userInputInteger = scanner.nextInt();
        System.out.println("Your integer was: " + userInputInteger);

        System.out.println("What is your name?");
        String carriageReturn = scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name + ". Nice to meet you! ");
    }
}
