package QLX;

public interface QuanLy<T> {
    void them(T t); //T là tên kiểu dữ liệu của lớp cha ; tham chiếu "t" có kiểu dữ liệu là T
    void sua(String name, T t);
    void xoa(String name);
    int timKiem(String name);
    void sapXep();
    void in();
}
