package QLCB;

public interface QuanLy<T> {
    void add(T t);
    void display();
    int findByName(String name);
    void exit();
}
