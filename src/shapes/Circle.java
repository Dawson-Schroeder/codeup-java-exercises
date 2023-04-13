package shapes;

public class Circle {
    private double radius;
    private double area;
    private double circumference;

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }


    public double doubleR(){
        return radius * 2;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public void printStats() {
        System.out.printf("your circle has:)%n radius: %.2f%n area: %.2f%n circumference: %.2f%n", radius, area, circumference);
    }

}
