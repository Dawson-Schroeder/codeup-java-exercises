package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(){}
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
//        System.out.println("In-Rect");
        return (this.length * 2) + (this.width * 2);
    }

    public double getArea(){
//        System.out.println("In-Rect");
        return (this.length * this.width);
    }
}