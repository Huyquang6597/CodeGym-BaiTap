package BaiTap;

public interface Manager<T> {
    void add(T t);
    void edit(int id , T t);
    void delete(int id);
    void display();
    int findById(int id);
}
