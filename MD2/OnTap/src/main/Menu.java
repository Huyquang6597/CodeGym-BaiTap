package main;

import manager.ManageRole;
import object.Role;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
ManageRole manageRole = new ManageRole();
String str;
int choice;
Scanner sc = new Scanner(System.in);

    public Menu() throws FileNotFoundException {
    }

    public void menuMain(){
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
        choice = sc.nextInt();
        switch (choice){
            case 1:

        }

    }
    public void menuDisplay(){

    }

    public void menuAdd(){

    }
    public void menuEdit(){

    }

    public void menuDelete(){

    }
    public void menuFindById(){

    }
}
