package grades;

public class StudentsTest {
    public static void main(String[] args) {
        // create a new student named "Alice"
        Student alice = new Student("Alice");

        // add some grades to Alice's grades ArrayList
        alice.addGrade(80);
        alice.addGrade(90);
        alice.addGrade(85);

        // print Alice's name and her average grade
        System.out.println(alice.getName() + "'s average grade is: " + alice.getGradeAverage());
    }
}

