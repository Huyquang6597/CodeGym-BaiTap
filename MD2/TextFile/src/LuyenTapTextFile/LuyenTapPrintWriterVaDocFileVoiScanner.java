package LuyenTapTextFile;

import java.io.*;
import java.util.Scanner;

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

//        try {
//            File inFile = new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/Demo");
//            FileReader fileReader = new FileReader(inFile); //Nối FileReader với 1 file text
//            BufferedReader reader = new BufferedReader(fileReader); // Nối BufferedReader với FileReader
//            String line = null;
//            while ((line = reader.readLine()) != null) { //Đọc từng dòng cho đến khi không đọc được gì nữa
//                System.out.println(line);
//            }
//            reader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        //Đọc 1 dãy số từ File với Scanner
//        File file = new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/Demo");
//        Scanner input = new Scanner(new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/Demo"));
//        String[] words = new String[100];
//
//        int[] numbers = new int[100];
//        int i = 0;
//        if (input.hasNextLine()) {
//            input.nextLine();
//        }
//        while (input.hasNextInt()) {
//            int num = input.nextInt();
//            numbers[i] = num;
//            i++;
//            if (i >= 100) {
//                break;
//            }
//        }
//        showNumber(numbers);
//
//
//    }
//
//    private static void showNumber(int[] numbers) {
//        for (int number : numbers) {
//            if (number == 0) {
//                continue;
//            }
//            System.out.println(number);
//        }

//      ghi ra chữ với PrinWriter
//        File file2 = new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/Demo");
//        if(file2.exists()){
//            System.out.println("File da ton tai!");
//        }
//        PrintWriter writer = new PrintWriter(file2);
//        writer.write("hihehao");
//        writer.close();


//     Đọc 1 dãy số từ file với scanner
        Scanner scanner = new Scanner(new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/hhhh"));
        while (scanner.hasNext()){
            int s = scanner.nextInt();
            System.out.println(s);
        }
    }
}


