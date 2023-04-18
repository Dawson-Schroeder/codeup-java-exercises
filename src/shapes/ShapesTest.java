package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.printf("Rectangle:%n ");
        double area = box1.getArea();
        System.out.println("Area: " + area);
        double perimeter = box1.getPerimeter();
        System.out.println("Perimeter: " + perimeter);


        Rectangle box2 = new Square(5);
        System.out.printf("Square:%n ");
        double area2 = box2.getArea();
        System.out.println("Area: " + area2);
        double perimeter2 = box2.getPerimeter();
        System.out.println("Perimeter: " + perimeter2);
    }
}
