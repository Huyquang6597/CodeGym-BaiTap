import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static double C_F(double C) {
        double F;
        F = (9/5)*C +32;
        return F;
    }
    public static double F_C(double F) {
        double C;
        C = (5/9)*(F-32);
        return C;
    }
    public static void main(String[] args) {
        int chon;
        double C;
        double F;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("0 - Exit");
        System.out.println("1 - Chuyển đổi từ C sang F");
        System.out.println("2 - Chuyển đổi từ F sang C");
        System.out.println("Mời nhập chọn:");
        chon = scanner.nextInt();
        if (chon == 1) {
            System.out.println("Mời nhập độ C");
            C = scanner.nextDouble();
            double CC = C_F(C);
            System.out.println("Nhiệt độ từ C sang F là:" + CC);
        }
        else if (chon == 2) {
            System.out.println("Mời nhập độ F");
            F = scanner.nextDouble();
            double FF = F_C(F);
            System.out.println("Nhiệt độ từ C sang F là:" + FF);
        }
        else if (chon == 0) {
            System.exit(0);
        }
        else {
            System.out.println("Bạn chọn không đúng");
        }
    }
}