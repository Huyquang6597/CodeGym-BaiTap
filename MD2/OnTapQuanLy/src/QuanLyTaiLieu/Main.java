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
                String maTaiLieu = scanner.nextLine();
                System.out.println("Nhap ten nha xuat ban");
                String tenNXB = scanner.nextLine();
                System.out.println("Nhap so ban phat hanh");
                int banPhatHanh = scanner.nextInt();
                Document dc = new Document( tenNXB, banPhatHanh);
                ql.add(dc);
                ql.display();

            }
            while (choice != 0) ;
        }
    }
}