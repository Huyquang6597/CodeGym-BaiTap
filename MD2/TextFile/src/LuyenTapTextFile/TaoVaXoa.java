package LuyenTapTextFile;

import java.io.File;

public class TaoVaXoa {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/TextFile/src/LuyenTapTextFile/Demo");
            if (file.delete()) {
                System.out.println(file.getName() + "da xoa");
            } else {
                System.out.println("Xoa file khong thanh cong");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
