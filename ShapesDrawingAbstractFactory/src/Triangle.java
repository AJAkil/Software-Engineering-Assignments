public class Triangle implements Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double Area() {
        double s = (Perimeter()/2);
        double p = s-side1;
        double q = s-side2;
        double r = s-side3;

        return Math.sqrt(s*p*q*r);
    }

    @Override
    public double Perimeter() {
        return (side1+side2+side3);
    }

    public double height(){
        return 0;
    }
}
