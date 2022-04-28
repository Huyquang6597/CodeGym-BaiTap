package StaffMananger;

import java.util.Scanner;

public class Menu {
    StaffManager staffManager = new StaffManager();
    String str;
    int choice;
    Scanner scanner = new Scanner(System.in);

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
    public void menuShow(){
        staffManager.show();
        menuMain();
    }
    public void menuAddStaff(){
        System.out.println("Nhap vao ten nhan vien: ");
        String name = scanner.nextLine();
        System.out.println("Nhap vao ca lam: ");
        String type = scanner.nextLine();
        System.out.println("Hien trang lam viec: ");
        String status = scanner.nextLine();
        System.out.println("Nhap vao muc luong: ");
        double salary = scanner.nextDouble();
        staffManager.addStaff(new Staff(name , type , status , salary));
        System.out.println("Da them thanh cong!");
        menuMain();

    }

    public void menuSearchStaff(){
        System.out.println("Nhap ten nhan vien muon tim: ");
        String name = scanner.nextLine();
        int a = staffManager.findByName(name);
        if(a != -1){
            System.out.println(staffManager.staffList.get(a));

        }else {
            System.out.println("Khong co nhan vien nay!");
        }
        menuMain();
    }

}
