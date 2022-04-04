import java.util.Scanner;

public class ThucHanh_MD2_9_ChuyenDoiTiente {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền (Mệnh giá USD): ");
        a = sc.nextDouble();
        double quydoi = a * 23000;
        System.out.println("Số tiền quy đổi sang VND là :" + quydoi);

    }
}
