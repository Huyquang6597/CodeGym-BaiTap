package ThucHanhDebug3;

import java.util.Scanner;
import java.util.Set;

public class ThucHanhDebug3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so X: ");
        int x = scanner.nextInt();
        System.out.println("Nhap so y: ");
        int y = scanner.nextInt();
        ThucHanhDebug3 calc  = new ThucHanhDebug3();
        calc.calculate(x, y);
    }
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong x + y = " + a);
            System.out.println("Hieu x - y = " + b);
            System.out.println("Tich x * y = " + c);
            System.out.println("Thuong x / y = " + d);
        } catch (Exception e) {
           System.err.println("Xay ra ngoai le: "+ e.getMessage());
        }
    }
}
