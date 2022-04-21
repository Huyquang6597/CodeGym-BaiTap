package QuanLyTaiLieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();
        int choice = 0;
        do {
            System.out.println("*******************Menu*******************");
            System.out.println("------------------------------------------");
            System.out.println("--------------Chon chuc nang--------------");

            System.out.println(
                    "1. Them moi tai lieu. \n"
                            + "2. Xoa tai lieu theo ma tai lieu. \n"
                            + "3. Tim kiem tai lieu theo loai. \n"
                            + "4. Hien thi thong tin ve tai lieu. \n"
                            + "0. Thoat. \n");
            choice = scanner.nextInt();//khi xuống dòng ngay thì nó sẽ tính vào dòng name nên phải thêm 1 dòng nữa
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Nhap ten tai lieu");
                String maTaiLieu = scanner.nextLine();// sc.NextLine() là mỗi lần enter máy sẽ hiểu là mình đã nhập
                System.out.println("Nhap ten nha xuat ban");
                int tenNXB = scanner.nextInt(); //Integer.parseInt(sc.nextLine()); Ép kiểu về kiểu số thực nhưng vẫn là sc.NextLine()
                System.out.println("Nhap so ban phat hanh");
                String banPhatHanh = scanner.nextLine();
                Document dc = new Document(maTaiLieu, tenNXB, banPhatHanh);
                ql.add(dc);
                ql.display();

            }
            while (choice != 0) ;
        }
    }
}