import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i;
//        i = 5;
//        while (i<= 15) {
//            System.out.println("i is " + i);
//            i++;

//        int x;
//        x = 100;
//        do {
//            System.out.println("x is " + x);
//            x-=5;
//        } while (x >= -10);

//        int num = 2;
//        do {
//            System.out.println(num);
//            num = (int) Math.pow(num, 2);
//        } while (num < 1000000);

//        for (int i = 100; i >= -10; i-=5) {
//            System.out.println("i is " + i );
//        }

//        for (int i = 2; i < 65536;) {
//            i = (int) Math.pow(i, 2);
//            System.out.println("i is " + i );
//        }
        //in class for the i*=i
        /*
        long i = 2;
        do {
            System.out.println(i);
            i*=i;
        } while (i < 1_000_000);

         */

        // FIZZBUZZ
//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println(i + ": FizzBuzz");
//            } else if(i % 5 == 0){
//                System.out.println(i + ": Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println(i + ": Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // Table Of Powers
//        Scanner input = new Scanner(System.in);
//        int num;
//
//        do {
//            System.out.print("Enter an integer to go up to");
//            num = input.nextInt();
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= num; i++) {
//                int squared = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-6d | %-7d | %-5d\n", i, squared, cubed);
//            }
//            System.out.print("\nDo you want to continue? [y,N]");
//        } while (input.next().equalsIgnoreCase("y"));
//        System.out.println("Goodbye!");

        // in-class-table-of-powers
        /*
        String choice = "y";
        while(choice.equalsIgnoreCase("y")) {
            System.out.println("What number would you like to go up to?");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            System.out.println("Here is your table");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= number; i++) {
                System.out.println(i + "       |1      |1");
                int squared = i * i;
                int cubed = squared * i;
                System.out.println(i + "       |" + squared + "      |" + cubed);
            }
            System.out.println("Do you want to contunue? [y/N]");
            input.nextLine();
            choice = input.nextLine();
        }
         */


        // Grade Calc
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("Enter an integer between 0 and 100");
            int i = scanner.nextInt();
            if (i <= 59){
                System.out.println("F");
            } else if (i <= 66 && i >= 60){
                System.out.println("D");
            } else if (i <= 79 && i >= 67){
                System.out.println("C");
            } else if (i <= 87 && i >= 80){
                System.out.println("B");
            } else {
                System.out.println("A");
            }
            System.out.print("Do you want to continue? [y,N]");
            continueLoop = scanner.next().equalsIgnoreCase("y");
        }
        System.out.println("Goodbye!");
        // Turnary version below
        /*
         Scanner scanner = new Scanner(System.in);
                do {
                    System.out.println("Enter an integer between 0 and 100");
                    int i = scanner.nextInt();
                    char grade = (i >= 88) ? 'A' : (i >= 80) ? 'B' : (i >= 67) ? 'C' : (i >= 60) ? 'D' : 'F';
                    System.out.println(grade);
                    System.out.print("Do you want to continue? [y,N]");
                } while (scanner.next().equalsIgnoreCase("y"));
                System.out.println("Goodbye!");
         */
        // in class grade calc
        /*
        System.out.println("What is the grade out of 100?");
        int numberGrade = scanner.nextInt();
        scanner.nextLine();
        if (numberGrade >= 99){
            System.out.println("A+");
        } else if (numberGrade <= 98 && numberGrade >= 88){
            System.out.println("A");
        } else if (numberGrade <= 87 && numberGrade >= 80){
            System.out.println("B");
        } else if (numberGrade <= 79 && numberGrade >= 67){
            System.out.println("C");
        } else if (numberGrade <= 66 && numberGrade >= 60) {
            System.out.println("D");
        } else if (numberGrade <= 59 && numberGrade >= 0) {
            System.out.println("F");
        }
         */


    }
}


