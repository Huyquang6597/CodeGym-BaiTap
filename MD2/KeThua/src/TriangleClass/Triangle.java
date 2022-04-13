package TriangleClass;

import java.util.Scanner;

public class Triangle extends Shape {
    private double h = 1.0;
    private String color;

    public Triangle() {
    }

    public Triangle(double h) {
        this.h = h;
        this.color = color;
    }

    public Triangle(double side1, double side2, double side3 , String color) {
        super(side1, side2, side3);

        this.color = color;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter(){
        return getSide1() + getSide2() + getSide3();
    }
    public double getHeight(){
        double p = getPerimeter()/2;
        return 2 * Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3())) / getSide1();
    }
    public double getArea(){
        return getSide1() * getHeight() / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" + "h=" + h + ", color='" + color + '\'' + '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        double side1 = scanner.nextDouble();
        System.out.println("Nhap canh b: ");
        double side2 = scanner.nextDouble();
        System.out.println("Nhap canh c: ");
        double side3 = scanner.nextDouble();
//        System.out.println("Nhap chieu cao: ");
//        double h = scanner.nextDouble();
        System.out.println("Nhap mau cua tam giac: ");
        String color = scanner.toString();
        Triangle triangle = new Triangle(side1, side2,side3,"White");
        System.out.println(triangle.getArea());
        System.out.println(triangle);
    }
}
