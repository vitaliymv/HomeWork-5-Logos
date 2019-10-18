package circle;

import java.util.Scanner;

public class Circle {

    private double radius;
    private double diameter;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public Circle() {}

    public void printData() {
        System.out.println("Radius circle R = " + radius);
        System.out.println("Diameter circle D = " + diameter);
    }

    public double area() {
        return Math.round(Math.PI * Math.pow(radius, 2));
        //return Math.round((Math.PI * Math.pow(diameter, 2)) / 4);
    }

    public double length() {
        return Math.round(2 * Math.PI * radius);
        //return Math.round(Math.PI * diameter);
    }

    public static void main(String[] args) {

        System.out.print("Enter radius and diameter circle: ");

        Scanner scanData = new Scanner(System.in);
        double r = scanData.nextDouble();
        double d = scanData.nextDouble();

        Circle circle = new Circle(r, d);

        circle.printData();
        System.out.println();
        System.out.println("Area this circle S = " + circle.area());
        System.out.println("Length this circle C = " + circle.length());

        scanData.close();
    }
}