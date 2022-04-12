package TriangleClass;

public class Triangle extends Shape {
    private double h = 1.0;
    private String color;

    public Triangle() {
    }

    public Triangle(double h) {
        this.h = h;
        this.color = color;
    }

    public Triangle(double side1, double side2, double side3,double h , String color) {
        super(side1, side2, side3);
        this.h = h;
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
    public double getArea(){
        return 1/2*getSide1()*h;
    }
}
