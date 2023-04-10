import java.util.Scanner;

public class ControlFlowLecture {
    public static void main(String[] args) {
        // ==================== boolean expressions
        // >, >=, <, <=, ==, !=
        double discountPercentage = 2.3;
//        System.out.println(discountPercentage > 2.0);

        // ==================== logical operators
        // &&, ||, &, |, !
//        System.out.println(discountPercentage > 3 && discountPercentage == 2.3);

        // ==================== string comparison
        Scanner sc = new Scanner(System.in);
//        System.out.println("Continue? [y/N]");
        String userInput = sc.next();
        boolean confirmation = userInput.equalsIgnoreCase("y");
//        System.out.println(confirmation);

        // ==================== control structures
        // if, else if, else
        if (/*condition*/discountPercentage > 2) {
            //conditional code
//            System.out.println("Discount percentage is greater than 2.");
        }

        // switch
        int caseSwitch = 1;
        switch (caseSwitch) {
            case 1:
//                System.out.println("Case 1");
                break;
            case 2:
//                System.out.println("Case 2");
                break;
            default:
//                System.out.println("Default case");
        }

        // while loop
//        int i = 0;
//        while (i < 10) {
////            System.out.println("i is " + i);
//            i++;
//        }

        // do while loop
//        int x = 10;
//        do {
////            System.out.println("x is " + x);
//            x++;
//        } while (x < 10);

        // for loop
//        for(int i = 0; i < 10; i++){
//            System.out.println("i is " + i );
//        }

        // break and continue
        for(int i = 0; i < 10; i++) {
            System.out.println("i is " + i );
            if (i == 5) {
                break;
            }
        }


    }
}
