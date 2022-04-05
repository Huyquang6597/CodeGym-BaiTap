import java.util.Scanner;

public class hhh {
    public static void main(String[] args) {
        String[] mang = {"Không", "Một", "Hai", "Ba",
                "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số");
        int so = scanner.nextInt();
        if (so < 10) {
            for (int i = 0; i < mang.length; i++) {
                System.out.println(mang[so]);
                break;
            }
        } else if (so < 100) {
            for (int i = 0; i < mang.length; i++) {
                System.out.println(mang[so / 10] + "mươi" + mang[so % 10]);
                break;
            }
        } else {
            for (int i = 0; i < mang.length; i++) {
                System.out.println(mang[so / 100] + "trăm" + mang[(so % 100) / 10] + "mươi" + mang[so % 10]);
                break;
            }
        }
    }
}
