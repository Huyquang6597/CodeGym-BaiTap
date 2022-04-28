package StaffMananger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    StaffManagement staffManager = new StaffManagement();
    String str;
    int choice;
    Scanner scanner = new Scanner(System.in);

    public Menu() throws IOException {
    }

    public void menuMain() {
        str = """
                 ==================Menu================== |
                 ---------------------------------------- |
                 0 .Xem danh sach                         |
                 1. Them nhan vien                        |
                 2. Tim kiem nhan vien                    |
                 3. In danh sach nv full time             |
                 4. Chinh sua thong tin nv                |
                 5. Dieu chinh trang thai                 |
                 6. Tinh tong luong nhan vien             |
                 7. Thoat                                 |
                                                          |
                 Nhap vao lua chon tu 0-6, 7 de thoat     |
                                                          |
                ==========================================|
                """;
        System.out.println(str);
        choice = scanner.nextInt();
        switch (choice) {
            case 0:
                menuShow();
                break;
            case 1:
                menuAddStaff();
                break;
            case 2:
                menuSearchStaff();
                break;
            case 3:
                menuPrintFullTime();
                break;
            case 4:
                menuEditStaffInfo();
                break;
            case 5:
                menuChangeStaffStatus();
                break;
            case 6:
                menuCalToTalSalary();
                break;
            default:
                System.exit(7);
                break;
        }
    }

    public void menuShow() {
        staffManager.show();
        menuMain();
    }

    public void menuAddStaff() {
        System.out.println("Nhap vao ten nhan vien: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhap vao ca lam: ");
        boolean type = scanner.nextBoolean();
        System.out.println("Hien trang lam viec: ");
        boolean status = scanner.nextBoolean();
        System.out.println("Nhap vao muc luong: ");
        long salary = scanner.nextLong();
        staffManager.addStaff(new Staff(name, type, status, salary));
        System.out.println("Da them thanh cong!");
        menuMain();

    }

    public void menuSearchStaff() {
        System.out.println("Nhap ten nhan vien muon tim: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        int a = staffManager.findByName(name);
        if (a != -1) {
            System.out.println(staffManager.staffList.get(a));

        } else {
            System.out.println("Khong co nhan vien nay!");
        }
        menuMain();
    }

    public void menuEditStaffInfo() {
        System.out.println("Nhap vao ten can sua: ");
        scanner.nextLine();

        String editByName = scanner.nextLine();
        int a = staffManager.findByName(editByName);
        if (a != -1) {
            String name = scanner.nextLine();
            boolean status;
            boolean type;
            try {
                System.out.println("Co phai nhan vien Full-time khong?  true - Full-time / false - Part-time");
                type = scanner.nextBoolean();
                System.out.println("Co phai nhan vien dang lam khong?  true - Dang lam / false - Da nghi");
                status = scanner.nextBoolean();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Co phai nhan vien Full-time khong?  true - Full-time / false - Part-time");
                type = scanner.nextBoolean();
                System.out.println("Co phai nhan vien dang lam khong?  true - Dang lam / false - Da nghi");
                status = scanner.nextBoolean();
            }
            System.out.println("Nhap vao tien luong cua nhan vien: ");
            long salary = scanner.nextLong();
            staffManager.editByName(editByName, new Staff(name, type, status, salary));
            menuMain();
        } else {
            System.out.println("Khong co!");
        }


    }
}
