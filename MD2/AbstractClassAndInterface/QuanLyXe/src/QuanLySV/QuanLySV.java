package QuanLySV;

import QLX.Oto;

public class QuanLySV implements QuanLy<Student> {

    private Student[] danhSach = new Student[4];
    private int size = 0;
    private Student[] danhSachXoa;

    @Override
    public void them(Student student) {
        danhSach[size] = student;
        size++;
    }

    @Override
    public void sua(String name, Student student) {
        int viTri = timKiem(name);
        if (viTri != -1) {
            danhSach[viTri] = student;
        } else {
            System.out.println("Khong tim thay!");
        }
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size ; i++){
if (name == danhSach[i].getName()){
    return i;
}
        } return -1;
    }

    @Override
    public void hienThi() {
for (int i = 0 ; i <size;i++){
    System.out.println(danhSach[i]);
}
    }
}
