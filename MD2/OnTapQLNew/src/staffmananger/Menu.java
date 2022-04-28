package staffmananger;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    StaffManagement staffManager = new StaffManagement();
    String str;
    int choice;
    Scanner scanner = new Scanner(System.in);

    public Menu() throws Exception {
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
                menuSal();
                break;
            default:
                System.exit(7);
                break;
        }
    }

    //Chức năng 0
    public void menuShow() {
        staffManager.show();
        menuMain();
    }

    //Chức năng 1
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

    //Chức năng 2
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

    //Chức năng 3
    void menuPrintFullTime() {
        str = """
                 ---Danh sach nhan vien
                 1. Nhan vien Full-time
                 2. Nhan vien Part-time
                 3. Quay lai
                    
                """;
        System.out.println(str);
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                staffManager.filterFulltimeStaff();
            case 2:
                staffManager.filterParttimeStaff();
            default:
                menuMain();
        }

    }


    //Chức năng 4
    public void menuEditStaffInfo() {
        System.out.println("Nhap vao ten can sua: ");
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
            } catch (InputMismatchException e) { //InputMismatchException : nếu nhập không phải dạng true/false thì sẽ bắt nhập lại chỉ được 1 lần
                scanner.nextLine();
                System.out.println("Co phai nhan vien Full-time khong?  true - Full-time / false - Part-time");
                type = scanner.nextBoolean();
                System.out.println("Co phai nhan vien dang lam khong?  true - Dang lam / false - Da nghi");
                status = scanner.nextBoolean();
            }
            System.out.println("Nhap vao tien luong cua nhan vien: ");
            long salary = scanner.nextLong();
            staffManager.editByName(editByName, new Staff(name, type, status, salary));

        } else {
            System.out.println("Khong co!");
        }
        System.out.println("Da sua thanh cong!");
        menuMain();
    }


    //Chức năng 5
    public void menuChangeStaffStatus() {
        System.out.println("Nhap ten nhan vien muon tim: ");
        scanner.nextLine();
        String nameS = scanner.nextLine();
        if (staffManager.findByName(nameS) != -1) {
            System.out.println("Ban co muon thay doi trang thai cua nhan vien" + nameS + "? nhan 'Y' de tiep tuc");
            String nameC = scanner.nextLine();
            if (nameC.equals("y")) { //biến nameC so sánh bằng với dạng String 'y' thì lệnh thực thi
                staffManager.updateStaffStatus(nameS);
                System.out.println("Da thay doi thanh cong");
            } else {
                System.out.println("Lenh da huy bo");
            }
        } else {
            System.out.println("Khong tim thay nhan vien!");
        }
        menuMain();
    }

    //Chức năng 6
    void menuSal() {
        str = """
                 ---Tinh tong luong nhan vien
                 1. Nhan vien Full-time
                 2. Nhan vien Part-time
                 3. Toan bo nhan vien
                 4. Quay lai
                                        
                """;
        System.out.println(str);
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                menuCalSalaryFulltime();
            case 2:
                menuCalSalaryParttime();
            case 3:
                menuCalToTalSalary();
            default:
                menuMain();
        }

    }


    public void menuCalSalaryParttime() {
        System.out.println("Tong luong cua nhan vien lam Part-time la: " + staffManager.calSalaryParttime());
        menuMain();
    }

    public void menuCalSalaryFulltime() {
        System.out.println("Tong luong cua nhan vien lam Part-time la: " + staffManager.calSalaryFulltime());
        menuMain();
    }

    public void menuCalToTalSalary() {
        System.out.println("Tong tien luong cua nhan vien la: " + staffManager.calTotalSalary());
        menuMain();
    }
}
