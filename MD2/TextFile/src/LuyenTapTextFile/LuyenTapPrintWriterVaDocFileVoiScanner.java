package LuyenTapTextFile;

import java.io.*;

public class LuyenTapPrintWriterVaDocFileVoiScanner {
    public static void main(String[] args) throws FileNotFoundException {
        // Dữ liệu được ghi trên Console sử dụng lớp PrintWriter
//        PrintWriter writer = new PrintWriter(System.out);
//        writer.write("HIHIHIH");
//        writer.flush();
//        writer.close();
        // Dữ liệu được ghi vào File sử dụng PrintWriter
//        try {
//        PrintWriter writer1 = null;
//        writer1 = new PrintWriter(new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/Demo"));
//        writer1.write("Hahahaha232ha");
//        writer1.flush();
//        writer1.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }

        try {
            File inFile = new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/Demo");
            FileReader fileReader = new FileReader(inFile); //Nối FileReader với 1 file text
            BufferedReader reader = new BufferedReader(fileReader); // Nối BufferedReader với FileReader
            String line = null;
            while ((line = reader.readLine()) != null) { //Đọc từng dòng cho đến khi không đọc được gì nữa
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
