package FamilyManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Family family = new Family();
        int choice = 0;
        do {
            System.out.println("*******************Menu*******************");
            System.out.println("------------------------------------------");
            System.out.println("--------------Chon chuc nang--------------");

            System.out.println(
                    "1. Them thanh vien. \n"
                            + "2. Xoa thanh vien. \n"
                            + "3. Sua thanh vien. \n"
                            + "0. Thoat. \n");
            choice = sc.nextInt();//khi xuống dòng ngay thì nó sẽ tính vào dòng name nên phải thêm 1 dòng nữa
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Nhap ten thanh vien");
                String name = sc.nextLine();// sc.NextLine() là mỗi lần enter máy sẽ hiểu là mình đã nhập
                System.out.println("Nhap tuoi thanh vien");
                int age = sc.nextInt(); //Integer.parseInt(sc.nextLine()); Ép kiểu về kiểu số thực nhưng vẫn là sc.NextLine()
                System.out.println("Nhap cong viec cua thanh vien");
                String job = sc.nextLine();
                sc.nextLine();
                System.out.println("Nhap so CCCD");
                long identityCard = sc.nextLong();
                System.out.println("Nhap dia chi");
                String address = sc.nextLine();
                sc.nextLine();
                System.out.println("Nhap so thanh vien");
                int familyMember = sc.nextInt();
                Person person = new Person(name, age, job, identityCard, address, familyMember);
                family.add(person);
                family.display();


            } else if (choice == 2) {
                System.out.println("Nhap ten thanh vien muon xoa: ");
                String name = sc.nextLine();
                System.out.println("Xoa thanh vien trong gia dinh" + name);
                family.delete(name);
                family.display();
            } else if (choice == 3) {

            }

        } while (choice != 0);


//        int choice = -1;
//        while (choice != 0) {
//            System.out.println("*******************Menu*******************");
//            System.out.println("------------------------------------------");
//            String format = "|%1$-10s|%2$-30s|\n";
//            System.out.format(format, "Lua chon", "Chuc nang");
//            System.out.println("------------------------------------------");
//            System.out.println("--------Nhap thong tin thanh vien--------");
//            System.out.println("Nhap ten thanh vien");
//            System.out.println("Nhap tuoi thanh vien");
//            System.out.println("Nhap cong viec cua thanh vien");
//            System.out.println("Nhap so CCCD");
//            System.out.format(format, "1", "Them thanh vien");
//            System.out.format(format, "2", "Xoa thanh vien");
//            System.out.format(format, "3", "Sua thanh vien");
//            System.out.format(format, "0", "Thoat");
//            System.out.println("------------------------------------------");
//            System.out.println("|Nhap vao lua chon tu 1-3 , 0 de thoat! |");
//            System.out.println("------------------------------------------");
//            try {
//                choice = sc.nextInt();
//            } catch (Exception e) {
//                System.out.println("Chi duoc nhap so");
//                sc.nextLine();
//                choice = -1;
//            }
//            switch (choice) {
//                case 1:
//                    System.out.println("Nhap ten thanh vien");
//
//                    break;
//                case 2:
//                    System.out.println("Nhap tuoi thanh vien");
//                    break;
//                case 3:
//                    System.out.println("Nhap cong viec cua thanh vien");
//                    break;
//                case 4:
//                    System.out.println("Nhap so CCCD");
//                    break;
//                case 0:
//                    System.out.println("Hẹn gặp lại!");
//                    break;
//            }
//        }
    }
}

