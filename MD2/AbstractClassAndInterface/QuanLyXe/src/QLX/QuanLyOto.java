package QLX;

import java.util.Arrays;

public class QuanLyOto implements QuanLy<Oto> {
    private Oto[] danhSach1 = new Oto[3];
    private int size1 = 0;
    private Oto[] danhSachXoa;

    @Override
    public void them(Oto oto) {
        danhSach1[size1] = oto;
        size1++;
    }

    @Override
    public void sua(String name, Oto oto) {
//        danhSach1[timKiem(name)] = oto;
        int viTri = timKiem(name);
        if (viTri != -1) {
            danhSach1[viTri] = oto;
        } else {
            System.out.println("Không tìm thấy!");
        }
    }

    @Override
    public void xoa(String name) {
        danhSachXoa = new Oto[size1 - 1];
        int viTri = timKiem(name);
        if (viTri != -1) {
            for (int i = 0; i < viTri; i++) {
                danhSachXoa[i] = danhSach1[i];
            }
            for (int i = viTri; i < size1 - 1; i++) {
                danhSachXoa[i] = danhSach1[i + 1];
            }
        } else {
            System.out.println("Không tìm thấy!");
        }
    }
    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size1; i++) {
            if (name == danhSach1[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {
        Arrays.sort(danhSach1);
    }

    @Override
    public void in() {
        for (int i = 0; i < size1; i++) {
            System.out.println(danhSach1[i]);
        }
        System.out.println("-----------------------");
    }
    public void in2(){
        for (int i = 0 ; i < danhSachXoa.length;i++){
            System.out.println(danhSachXoa[i]);
        }
    }

    public static void main(String[] args) {
        QuanLyOto ql1 = new QuanLyOto();
        Oto xh1 = new Oto("Toyota", "Vàng", "HoaCho", 120, 4);
        Oto xh2 = new Oto("Mazda", "Đỏ", "R3", 220, 6);
        Oto xh3 = new Oto("Vinfast", "Xanh", "R15", 120, 24);
        ql1.them(xh1);
        ql1.them(xh2);
        ql1.them(xh3);
        ql1.in();
//        Oto xm4 = new Oto("Mazda", "Xanh", "R1", 700, 6);
//        ql1.sua("R15", xm4);
//        ql1.in();
        ql1.xoa("R3");
        ql1.in2();
//        ql1.sapXep();
//        ql1.in();
    }

}

