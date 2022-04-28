package StaffMananger;

public interface Manager<T> {
    void show();
    void addStaff(T t);
    void editByName(String name , T t);
    void updateStaffStatus(String name);
    void printFullTime();
    void removeByName(String name);
    int findByName(String name); //Tìm theo tên (Gần đúng)
}
