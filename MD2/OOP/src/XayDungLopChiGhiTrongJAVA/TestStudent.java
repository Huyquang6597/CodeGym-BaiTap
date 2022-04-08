package XayDungLopChiGhiTrongJAVA;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        String name = scanner.nextLine();
        System.out.println("Nhap lop hoc: ");
        String classes = scanner.nextLine();
        Student student1 = new Student(name, classes);
        System.out.println("Sinh vien: " + name + " " + "hoc lop: " + classes);
    }
}
