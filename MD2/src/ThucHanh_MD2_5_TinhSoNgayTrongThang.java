import java.util.Scanner;

public class ThucHanh_MD2_5_TinhSoNgayTrongThang {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tháng");
        a = scanner.nextInt();
        if (a == 2) {
            System.out.println("Tháng này có 28 hoặc 29 ngày");
        }
        else if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
            System.out.println("Tháng này có 31 ngày");
        }
        else if (a == 4 || a == 6 || a == 9 || a == 11) {
            System.out.println("Tháng này có 30 ngày");
        }
        else {
            System.out.println("Không có tháng như vậy");
        }
    }
}
