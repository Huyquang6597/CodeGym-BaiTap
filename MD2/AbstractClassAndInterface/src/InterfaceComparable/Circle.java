package InterfaceComparable;

import java.util.Scanner;

public class Circle extends Shape{
    private double radius;
    private String color = "red";
    private boolean filled = true;

    public Circle() {

    }
public Circle(double radius){
        this.radius=radius;
}
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public boolean getFilled() {
        return filled;
    }
    public void setRadius(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        double radius = scanner.nextDouble();
        Circle circle1 = new Circle(radius, "White" , true);
        System.out.println("Dien tich hinh tron la: " + circle1.getArea() );
        System.out.println(circle1);
    }
}