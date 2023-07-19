import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {

        String string = "We don't need no education ";
        System.out.println(string);
        String string2 = "We don't need no thought control ";
        System.out.println(string2);

        String string3 = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(string3);

        String string4 = "In windows, the main drive is usually C:\\\n";
        System.out.println(string4);

        String string5 = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";
        System.out.println(string5);

    }
}

class Bob {
    public static void main(String[] args) {
        // basic version
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's up");
        String response = scanner.nextLine();
        if(response.endsWith("?")){
            System.out.println("Sure");
        } else if (response.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (response.length() == 0){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }
         */

        Scanner scanner = new Scanner(System.in);
        boolean endConversation = false;

        while (!endConversation) {
            System.out.print("What's up? if you're done, say bye already... ");
            String response = scanner.nextLine();

            if (response.endsWith("?")) {
                System.out.println("Bob: Sure");
            } else if (response.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (response.length() == 0) {
                System.out.println("Bob: Fine. Be that way!");
            } else if (response.equalsIgnoreCase("bye")) {
                endConversation = true;
            } else {
                System.out.println("Bob: Whatever nerd");
            }
        }



    }
}
