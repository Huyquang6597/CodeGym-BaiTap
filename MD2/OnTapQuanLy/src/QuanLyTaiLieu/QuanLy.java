package QuanLyTaiLieu;

public interface QuanLy<T> {
    void add(T t);
    void delete(int id);
    void display();
    int findById(int id);
    int findByType(T t , int id);
    void exit();
}
