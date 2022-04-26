package LuyenTapTextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LuyenTapFileWriterVaFileReader {
    public static void main(String[] args) throws IOException {
        //Ghi ra file với FileWriter
//        String txt = "Nguyen hihihi"; // Ghi chuỗi vào trong file
//        String arr[] = {"Nhihih", "hdsjfhfwe", "uiqdfdf"};
//
//        try {
//            FileWriter fw = new FileWriter("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/Demo"); //file writer mặc định sẽ tạo dữ liệu ới và xóa dữ liệu cũ đi
//            BufferedWriter bw = new BufferedWriter(fw);
//            for (String s : arr) {
//                bw.write(s); //s là từng phần tử trong dãy arr[]
//                bw.newLine(); //in xuống dòng
//            }
//            bw.write(txt);
//            bw.close();
//            fw.close();
//
//        } catch (Exception e) {
//
//        }

        //Ghi ra file với FileWriter nhưng người dùng nhập vào rồi in ra file
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        try {
            FileWriter fw = new FileWriter("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/Demo");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(txt);
            bw.close();
            fw.close();

        } catch (IOException e){

        }


    }
}
