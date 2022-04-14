package QuanLySV;

public class Main {
    public static void main(String[] args) {
        QuanLySV quanLySV = new QuanLySV();
        Student sv1 = new Student("Hoa" , 101 , 22 , 6);
        Student sv2 = new Student("Hieu" , 102 , 22 , 4);
        Student sv3 = new Student("Hung" , 103 , 22 , 7);
        Student sv4 = new Student("Khanh" , 104 , 22 , 9);
        quanLySV.them(sv1);
        quanLySV.them(sv2);
        quanLySV.them(sv3);
        quanLySV.them(sv4);
quanLySV.hienThi();
    }
}
