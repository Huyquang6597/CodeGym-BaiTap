import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien muon gui: ");
        money = sc.nextDouble();
        System.out.println("Nhap so thang muon gui: ");
        month = sc.nextInt();
        System.out.println("Nhap lai suat hang nam theo ti le %: ");
        interestRate = sc.nextDouble();
        double tienlai = 0;
        for (int i = 0 ; i < month; i++) {
            tienlai = money * (interestRate/100)/12 * month;
        }
        System.out.println("So tien lai nhan duoc la: " + tienlai);

    }
}
