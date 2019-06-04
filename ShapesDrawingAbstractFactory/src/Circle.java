public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return (3.1416)*radius*radius;
    }

    @Override
    public double Perimeter() {
        return 2*3.1416*radius;
    }
}
