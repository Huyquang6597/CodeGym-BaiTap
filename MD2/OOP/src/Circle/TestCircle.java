package Circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ban kinh: ");
        double radius = scanner.nextDouble();
        Circle circle1 = new Circle(radius);
//        String color = scanner.toString();
//        System.out.println("Nhap mau: ");




        System.out.println("Chu vi duong tron la: " + circle1.getArea());
    }
}
