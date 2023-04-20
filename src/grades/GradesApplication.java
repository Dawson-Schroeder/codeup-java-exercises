package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();


        Student alice = new Student("Alice");
        alice.addGrade(90);
        alice.addGrade(95);
        alice.addGrade(87);
        students.put("alice123", alice);

        Student timmy = new Student("Timmy");
        timmy.addGrade(12);
        timmy.addGrade(50);
        timmy.addGrade(67);
        students.put("timmy123", timmy);

        Student jimmy = new Student("Jimmy");
        jimmy.addGrade(77);
        jimmy.addGrade(97);
        jimmy.addGrade(74);
        students.put("jimmy123", jimmy);

        Student cartman = new Student("Cartman");
        cartman.addGrade(20);
        cartman.addGrade(12);
        cartman.addGrade(10);
        students.put("cartman123", cartman);

//        for (String username : students.keySet()) {
//            Student student = students.get(username);
//            System.out.println("Name: " + student.getName());
//            System.out.println("GitHub Username: " + username);
//            System.out.println("Grades: " + student.getGrades());
//            System.out.println("Average Grade: " + student.getGradeAverage());
//            System.out.println();
//        }

        System.out.println("Welcome!");
        System.out.printf("Here are the GitHub usernames of our students:%n");
        for (String username : students.keySet()){
            System.out.printf("|%s| ", username);
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        boolean askForAnotherStudent = true;

        while (askForAnotherStudent) {
            System.out.printf("%nWhat student would you like to see more information on? ");
            String input = scanner.next();
            Student student = getStudent(input, students);

            if (student == null) {
                System.out.printf("Sorry, no student found with the GitHub username of '%s'.%n", input);
            } else {
                System.out.printf("Name: %s - GitHub Username: %s%n", student.getName(), input);
                System.out.printf("Current Average: %.1f%n", student.getGradeAverage());
                System.out.println("All grades: " + student.getGrades());
            }
            askForAnotherStudent = askToSeeAnother(scanner);
        }

        System.out.println("Goodbye, and have a wonderful day!");
    }

    public static Student getStudent(String input, HashMap<String, Student> students) {
        if (students.containsKey(input)) {
            return students.get(input);
        } else {
            return null;
        }
    }

    public static boolean askToSeeAnother(Scanner scanner) {
        System.out.print("Would you like to see another student? (y/n): ");
        String input2 = scanner.next();
        return input2.equalsIgnoreCase("y");
    }


}
