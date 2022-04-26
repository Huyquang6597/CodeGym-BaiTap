package LuyenTapTextFile;

import java.io.File;
import java.io.IOException;

public class TaoVaXoa {
    public static void main(String[] args) throws IOException {
        //Tạo file
        File file = new File("src/LuyenTapTextFile/hihi.txt");
        if(!file.exists()){ //Kiểm tra file có tồn tại hay không
            file.createNewFile(); //Tạo file mới
        } else {
            System.out.println("Da ton tai!"); //
        }




        //Xóa file
//        try {
//            File file = new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/Demo");
//            if (file.delete()) {
//                System.out.println(file.getName() + "da xoa");
//            } else {
//                System.out.println("Xoa file khong thanh cong");
//            }
//        } catch (Exception e) {
//            System.out.println("Exception occurred");
//            e.printStackTrace();
//        }
    }
}
