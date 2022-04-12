package ClassCircle;

import java.util.Scanner;

public class Cylinder extends Circle {
    private double h;

    public Cylinder() {

    }

    public Cylinder(double h) {
        this.h = h;
    }

    public Cylinder(double h, double radius, String color) {
        super(radius, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double getVolume(){
        return  h * getRadius() * getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "h=" + h + '}';
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhap chieu cao: ");
        double h = scanner1.nextDouble();
       Cylinder  cylinder1 = new Cylinder(h);
//       cylinder1.setRadius(3);
        System.out.println("Nhap ban kinh: ");
        double radius = scanner1.nextDouble();
        cylinder1.setRadius(radius);
        System.out.println("The tich hinh tru la: "+ cylinder1.getVolume() );

    }
}
