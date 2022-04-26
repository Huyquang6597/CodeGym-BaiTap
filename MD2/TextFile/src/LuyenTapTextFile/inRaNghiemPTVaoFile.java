package LuyenTapTextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class inRaNghiemPTVaoFile {
    public static void main(String[] args) throws FileNotFoundException {
        //Đọc 2 số a , b từ 1 file đã tạo sẵn
        Scanner scanner = new Scanner(new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/inp.txt"));
        String s = scanner.nextLine();
//        System.out.println(s);
        String[]arr = s.split(";");
        double a = Integer.parseInt(arr[0]);
        double b = Integer.parseInt(arr[1]);

        //In ra phương trình bậc 1 ở 1 file mới
        PrintWriter pw = new PrintWriter("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/rs.txt");
        if(a == 0){
            if (b == 0){
                pw.println("Pt vo so nghiem");
            }else {
                pw.println("PT vo nghiem");
            }
        } else {
            pw.println("Pt co nghiem la: " + (-a/b));
        }
        pw.close();
        }
    }

