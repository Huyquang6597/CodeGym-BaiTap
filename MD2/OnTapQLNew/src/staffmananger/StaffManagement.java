package staffmananger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffManagement implements Manager<Staff> {
    List<Staff> staffList = new ArrayList<>();
//    final String path = "/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/OnTapQLNew/ListStaff.csv";
//    File filePath = new File(path);
//    WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
//
//
//    public StaffManagement() throws Exception {
//        writeAndReadFile.readFile(path, staffList);
//
//        writeAndReadFile.writeFile(path, staffList);
//    }


    @Override
    public void show() {
        for (int i = 0; i < staffList.size(); i++) {
            System.out.println(staffList.get(i));
        }
        System.out.println("------------------------");
    }


    @Override
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    @Override
    public void editByName(String name, Staff staff) {
        int indexOfName = findByName(name);
        if (indexOfName == -1) {
            System.out.println("Khong co!");
        } else {
            staffList.set(indexOfName, staff);
        }
        System.out.println("Da sua thanh cong");

    }

    @Override
    public void updateStaffStatus(String name) {
        int index = findByName(name);
        boolean status = staffList.get(index).isStatus();
        status = !status;
        staffList.get(index).setStatus(status);
    }


    @Override
    public void printFullTime() {

    }

    @Override
    public void removeByName(String name) {
        int indexOfName = findByName(name);
        if (indexOfName == -1) {
            System.out.println("Khong co nguoi can xoa");
        } else {
            staffList.remove(indexOfName);
        }
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getName().contains(name)) {
                return i;
            }
        }
        return -1;
    }

    public int calSalaryFulltime() {
        int sum = 0;
        for (Staff staff : staffList) {
            if (staff.isType()) {
                sum += staff.getSalary();
            }
        }
        return sum;
    }

    public int calSalaryParttime() {
        int sum = 0;
        for (Staff staff : staffList) {
            if (!staff.isType()) {
                sum += staff.getSalary();
            }
        }
        return sum;
    }

    public int calTotalSalary(){
        int sum = 0;
        for (Staff staff: staffList) {
           sum += staff.getSalary();
        } return sum;
    }

    public void filterFulltimeStaff(){
        for (Staff staff: staffList) {
            if(staff.isType()){
                System.out.println(staff);
            }
        }
    }

    public void filterParttimeStaff(){
        for (Staff staff: staffList) {
            if(!staff.isType()){
                System.out.println(staff);
            }
        }
    }
}
