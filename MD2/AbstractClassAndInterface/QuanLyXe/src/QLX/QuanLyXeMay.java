package QLX;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay> {
    private XeMay[] danhSach = new XeMay[3]; //Khởi tạo số vị trí có đối tượng có kiểu dữ liệu là XeMay , nếu muốn sắp xếp theo danh sách phải nhập đủ kiểu dữ liệu mới chạy đc
    private int size = 0;


    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;

    }

    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach[timKiem(name)] = xeMay;

    }

    @Override
    public void xoa(String name) {
        int viTri = timKiem(name);
        if (viTri != -1){
            danhSach[viTri] = null;
        } else {
            System.out.println("Không tìm thấy!");
        }

    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name == danhSach[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {
        Arrays.sort(danhSach);
    }

    @Override
    public void in() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        QuanLyXeMay ql = new QuanLyXeMay();
        XeMay xm1 = new XeMay("Yamaha", "Óc Chó", "HoaCho", 120, 200);
        XeMay xm2 = new XeMay("Yamaha", "Đen đỏ", "R3", 220, 200);
        XeMay xm3 = new XeMay("Yamaha", "Xanh", "R15", 120, 200);
        ql.them(xm1);
        ql.them(xm2);
        ql.them(xm3);
        ql.in();
        XeMay xm4 = new XeMay("Yamaha", "Xanh", "R1", 700, 1000);
        ql.sua("R15", xm4);
        ql.in();
      ql.xoa("R3");
      ql.in();
      ql.sapXep();
      ql.in();
    }

}
