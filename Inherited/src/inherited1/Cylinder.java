package inherited1;

import java.util.Scanner;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height =  height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "inherited1.Cylinder[" + super.toString() + ",height=" + height + "]";
    }

    @Override
    public double getArea() {
        return 2 * Circle.PI * super.getRadius() * height + 2 * super.getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius: ");
        double radius = input.nextDouble();
        System.out.println("Height: ");
        double height = input.nextDouble();
        System.out.println("Color: ");
        String color = input.next();

        Cylinder cylinder = new Cylinder(radius, height, color);
        System.out.println("inherited1.Cylinder : " + cylinder);
        System.out.println("inherited1.Cylinder Area: " + cylinder.getArea());
        System.out.println("inherited1.Cylinder Volume: " + cylinder.getVolume());
    }
}

