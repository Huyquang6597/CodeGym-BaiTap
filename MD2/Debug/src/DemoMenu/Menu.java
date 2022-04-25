package DemoMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
//            String menu = """
//                ==============Menu==============
//                1. Hien thi
//                2. Them
//                3. Sua
//                4. Xoa
//                5. Thoat
//                """;
//
//            boolean check = false;
//            while (!check) {
//                System.out.println(menu);
//                System.out.println("Moi nhap lua chon");
//                try {
//                    int choice = scanner.nextInt();
//                    set(choice);
//                    switch (choice) {
//                        case 1:
//                            System.out.println("Danh sach la: ");
//                            break;
//                        case 2:
//                            System.out.println("Them");
//                            break;
//                        case 3:
//                            System.out.println("Sua");
//                            break;
//                        case 4:
//                            System.out.println("Xoa");
//                            break;
//                        case 5:
//                            System.exit(5);
//                            break;
//                    }
//                } catch (Exception e) {
//                    System.err.println("Khong co chuc nang do!");
//                    check = true;
//                }
//            }
//        }
//
//
//        public static void set(int c) throws Exception {
//            if (c <= 1 || c >= 5) {
//                throw new Exception();
//            }


            int choice = -1;
            while (true){
                System.out.println("Menu");
                System.out.println("1. Xem danh sach");
                System.out.println("2. them");
                System.out.println("3. Sua");
                System.out.println("4. Xoa");
                System.out.println("5. Thoat");
                try {
                    choice = scanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Chi duoc nhap so");
                    scanner.nextLine();
                }    switch (choice){
                    case 1:
                        System.out.println("Danh sach la");
                        break;
                    case 2:
                        System.out.println("Them...");
                        break;
                    case 3:
                        System.out.println("Sua...");
                        break;
                    case 4:
                        System.out.println("Xoa...");
                        break;
                    case 5:
                        System.out.println("Thoat...");
                        System.exit(0);
                        break;
                }
            }
        }
    }

