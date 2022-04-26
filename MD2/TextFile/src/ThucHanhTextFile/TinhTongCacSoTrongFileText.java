package ThucHanhTextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TinhTongCacSoTrongFileText {
    public void TinhTong(String s) {
        try {
            //Đọc file theo đường dẫn
            File file = new File(s);

            //Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            //Đọc từng dòng của file và tiến hành cộng tổng
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println(sum);
            br.close();

        } catch (Exception e) {
            System.out.println("File khong ton tai hoac noi dung co loi!");
        }
    }
}