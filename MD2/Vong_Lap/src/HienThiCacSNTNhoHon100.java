import java.util.Scanner;

public class HienThiCacSNTNhoHon100 {
    public static boolean SNT(int n) {
        if (n < 2) {
            return false;
        }
        String s = "SNT";
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                s = "KPSNT";
            }
        }
        if (s == "SNT") {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen to : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; count < n; i++) {
            if (SNT(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
    }
}
