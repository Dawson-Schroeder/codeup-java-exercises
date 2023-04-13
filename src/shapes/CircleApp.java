package shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("What is the radius of your circle in inches?");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        Circle circle1 = new Circle();
        circle1.setRadius((int) radius);
        circle1.setArea((int) circle1.getArea());
        circle1.setCircumference((int) circle1.getCircumference());
        circle1.printStats();
    }
}
