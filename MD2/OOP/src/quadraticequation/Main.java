package quadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter number c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();

        if (delta == 0) {
            System.out.println("Phuong Trinh co 1 nghiem la: " + (-b / (2 * a)));
        } else if (delta > 0) {
            System.out.println("Phuong trinh co nghiem 1 la: " + quadraticEquation.getRoot1());
            System.out.println("Phuong trinh co nghiem 1 la: " + quadraticEquation.getRoot2());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
