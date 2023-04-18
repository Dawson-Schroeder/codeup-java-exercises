package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Square(5);
        System.out.println("Area of square: " + myShape.getArea());
        System.out.println("Perimeter of square: " + myShape.getPerimeter());

        myShape = new Rectangle(7, 3);
        System.out.println("Area of rectangle: " + myShape.getArea());
        System.out.println("Perimeter of rectangle: " + myShape.getPerimeter());
    }
}

/* TODO:
*   1: Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
*       A: The class of Rectangle extends to Quadrilateral as the parent class,
*           Thats the class that actually sets the length and width from the start.
*   2: What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
*       A: Inteli J throws and error and asks you to create a Method called getLength or getWidth inside of Measurable.
*           Because the rectangle nor the square hold the data for length and width, quadralateral does.
 * */


/*
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
 */