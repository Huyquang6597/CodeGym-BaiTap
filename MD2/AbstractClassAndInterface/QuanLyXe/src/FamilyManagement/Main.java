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
            System.out.println("--------Nhap thong tin thanh vien--------");
            System.out.println("Nhap ten thanh vien");
String name = sc.toString();
            System.out.println("Nhap tuoi thanh vien");
            int age = sc.nextInt();
            System.out.println("Nhap cong viec cua thanh vien");
            String job = sc.toString();
            System.out.println("Nhap so CCCD");
            long identityCard = sc.nextLong();
            System.out.println("Nhap dia chi");
            String address = sc.toString();
            System.out.println("Nhap so thanh vien");
            int familyMember = sc.nextInt();
            System.out.println(
                    "1. Them thanh vien. \n"
                    +"2. Xoa thanh vien. \n"
                    +"3. Sua thanh vien. \n"
                    +"0. Thoat. \n");
            choice = sc.nextInt();

            if(choice == 1){

            } else if(choice == 2){

            } else if(choice == 3){

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

