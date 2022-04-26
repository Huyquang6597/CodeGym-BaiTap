package LuyenTapTextFile;

import java.io.*;
import java.util.Scanner;

public class TongTichMaxMin {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/inp.txt"));
        String s = scanner.nextLine();
        String [] arr = s.split(";");
        int sum = 0;
        int pof = 1;
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        System.out.println("Mang la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
            sum += Integer.parseInt(arr[i]);
            pof *= Integer.parseInt(arr[i]);
            if(Integer.parseInt(arr[i]) > max){
                max = Integer.parseInt(arr[i]);
            }
            if (Integer.parseInt(arr[i]) < min){
                min = Integer.parseInt(arr[i]);
            }

        }
        FileWriter fw = new FileWriter("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/rs.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Tong la: "+ sum + "\n"); //Thêm chuỗi vì đang ép kiểu chuỗi sang Interger
        bw.write("Tich la: "+ pof + "\n ");
        bw.write("Max la: "+ max + "\n ");
        bw.write("Min la: "+ min + " ");
        bw.close();
        fw.close();


    }
}
