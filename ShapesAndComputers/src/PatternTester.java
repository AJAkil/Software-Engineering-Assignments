import java.io.BufferedReader;
import java.io.FileReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PatternTester {

    //The following 4 methods checks if a certain shape fits in the screen or not
    public static boolean checkForRectangle(double screenWidth, double screenHeight, double length, double breadth) {
        if (length > screenWidth || breadth > screenHeight) return false;
        return true;
    }

    public static boolean checkForTriangle() {

        return true;
    }

    public static boolean checkForSquare(double screenWidth, double screenHeight, double length) {
        if (length > screenWidth || length > screenHeight) return false;
        return true;
    }

    public static boolean checkForCircle(double screenWidth, double screenHeight, double radius) {
        double diameter = radius + radius;
        if (diameter > screenWidth || diameter > screenHeight) return false;
        return true;
    }

    //This method prints everything
    public static void printOutput(String shapeName, double screenWidth, double screenHeight, double area, double perimeter) {

        int a = (int) screenWidth;
        int b = (int) screenHeight;
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println("The Shape Name: " + shapeName);
        System.out.println("The Screen Resolution: " + a + "X" + b);
        System.out.println("The Area: " + df.format(area));
        System.out.println("The Perimeter: " + df.format(perimeter));

    }

    public static void ProcessShape(String[] input, Computers compObj) {

        if (input[1].equalsIgnoreCase("Circle")) {

            double radius = Double.parseDouble(input[2]);
            Circle cobj = new Circle(radius);

            if (checkForCircle(compObj.screenWidth, compObj.screenHeight, radius)) {

                double area = cobj.Area();
                double perimeter = cobj.Perimeter();
                printOutput("Circle", compObj.screenWidth, compObj.screenHeight, area, perimeter);

            } else {
                System.out.println("The Shape is too large to fit in the screen of the Computer");
            }

        } else if (input[1].equalsIgnoreCase("Rectangle")) {

            double length = Double.parseDouble(input[2]);
            double breadth = Double.parseDouble(input[3]);
            Rectangle robj = new Rectangle(length, breadth);

            if (checkForRectangle(compObj.screenWidth, compObj.screenHeight, length, breadth)) {
                double area = robj.Area();
                double perimeter = robj.Perimeter();
                printOutput("Rectangle", compObj.screenWidth, compObj.screenHeight, area, perimeter);

            } else {
                System.out.println("The Shape is too large to fit in the screen of the Computer");
            }

        } else if (input[1].equalsIgnoreCase("Square")) {

            double length = Double.parseDouble(input[2]);
            Square sobj = new Square(length);

            if (checkForSquare(compObj.screenWidth, compObj.screenHeight, length)) {

                double area = sobj.Area();
                double perimeter = sobj.Perimeter();
                printOutput("Square", compObj.screenWidth, compObj.screenHeight, area, perimeter);

            } else {
                System.out.println("The Shape is too large to fit in the screen of the Computer");
            }

        } else if (input[1].equalsIgnoreCase("Triangle")) {

            double side1 = Double.parseDouble(input[2]);
            double side2 = Double.parseDouble(input[3]);
            double side3 = Double.parseDouble(input[4]);

            double sum1 = side1 + side2;
            double sum2 = side2 + side3;
            double sum3 = side3 + side1;

            if ((sum1 < side3) || (sum2 < side1) || (sum3 < side2)) {
                System.out.println("The Input is not of a valid triangle");
            } else {

                Triangle tobj = new Triangle(side1, side2, side3);

                if (checkForTriangle()) {
                    double area = tobj.Area();
                    double perimeter = tobj.Perimeter();
                    printOutput("Rectangle", compObj.screenWidth, compObj.screenHeight, area, perimeter);
                } else {
                    System.out.println("The Shape is too large to fit in the screen of the Computer");
                }
            }
        } else {
            System.out.println("Wrong Shape Input");
        }

    }

    //This method takes input from a file separated by commas and tokenize them and returns an array of string tokens
    public static String[] getInputFromFile(String fileName) {

        String reader;
        String[] temp = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while (true) {
                reader = br.readLine();
                if (reader == null) break;
                temp = reader.split(",");
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return temp;
    }

    public static void main(String[] args) {

        ComputerFactory cmpfactory = new ComputerFactory();
        Computers compObj;
        String[] input = getInputFromFile("input1.txt");

        if (input[0].equalsIgnoreCase("ComputerA")) {

            compObj = cmpfactory.getComputer("ComputerA");
            ProcessShape(input, compObj);

        } else if (input[0].equalsIgnoreCase("computerB")) {

            compObj = cmpfactory.getComputer("ComputerA");
            ProcessShape(input, compObj);

        } else if (input[0].equalsIgnoreCase("computerC")) {

            compObj = cmpfactory.getComputer("ComputerA");
            ProcessShape(input, compObj);

        } else {
            System.out.println("Wrong Name of computer, such a computer does not exist.");
        }

    }

}
