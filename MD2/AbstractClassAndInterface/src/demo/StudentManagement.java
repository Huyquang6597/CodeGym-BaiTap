package demo;

public class StudentManagement {
    private Student[] mangSinhVien;

    public StudentManagement() {

    }

    public StudentManagement(Student[] mangSinhVien) {
        this.mangSinhVien = mangSinhVien;
    }

    public Student[] getMangSinhVien() {
        return mangSinhVien;
    }

    public void setMangSinhVien(Student[] mangSinhVien) {
        this.mangSinhVien = mangSinhVien;
    }

    public void add(Student mangSinhVien) {

    }

    public void change(Student student, int viTri) {

    }

    public void delete(int viTri) {

    }

    public Student  search(String name) {
        return new Student();
    }
}
