package QLX;

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
//        danhSach[timKiem(name)] = xeMay;
        int viTri = timKiem(name);


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



}
