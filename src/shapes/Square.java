package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    public double getArea(double side) {
//        System.out.println("In-Square");
        return side * side;
    }
    public double getPerimeter(double side) {
//        System.out.println("In-Square");
        return side * 4;
    }
}

/*
public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    public double getArea() {
//        System.out.println("In-Square");
        return Math.pow(this.width, 2);
    }
    public double getPerimeter(double side) {
//        System.out.println("In-Square");
        return this.length * 4;
    }
}
 */