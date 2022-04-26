package ThucHanhTextFile;

import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Nhap duog dan file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        TinhTongCacSoTrongFileText readFileEx = new TinhTongCacSoTrongFileText();
        readFileEx.TinhTong("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/ThucHanhTextFile/Demo1");

    }
}
