package shapes;

public class Rectangle extends Quadrilateral {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}


/*protected double length;
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
    }*/
