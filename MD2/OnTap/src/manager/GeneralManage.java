package manager;

import object.Role;

public interface GeneralManage<T> {
    void add(T t);
    void edit(int id, T t);
    void delete(int id);
    T findById(int id);
    int findIndexById(int id);
    void showAll();
//    int findByName(String Name);
    void exit();

}
