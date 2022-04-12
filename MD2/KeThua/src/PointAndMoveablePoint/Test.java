package PointAndMoveablePoint;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so x: ");
        float x = scanner.nextFloat();
        System.out.println("Nhap so y: ");
        float y = scanner.nextFloat();
        System.out.println("Nhap toa do X: ");
        float xSpeed = scanner.nextFloat();
        System.out.println("Nhap toa do Y: ");
        float ySpeed = scanner.nextFloat();
        MoveablePoint m1 = new MoveablePoint(x, y, xSpeed, ySpeed);
        System.out.println(m1.move());
    }
}
