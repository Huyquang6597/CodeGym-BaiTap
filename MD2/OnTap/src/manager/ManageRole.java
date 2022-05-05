package manager;

import file.FileRoleCSV;
import object.Role;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ManageRole implements GeneralManage<Role> {
    private List<Role> list = new ArrayList<>();

    public ManageRole() throws FileNotFoundException {
list = FileRoleCSV.readFromFile();
    }


    public List<Role> getList() {
        return list;
    }

    public void setList(List<Role> list) {
        this.list = list;
    }

    @Override
    public void add(Role role) {
        list.add(role);
    }

    @Override
    public void edit(int id, Role role) {
        int indexOfId = findIndexById(id);
        if (indexOfId == -1) {
            System.out.println("Khong co!");
        } else {
            list.set(indexOfId, role);
        }
        System.out.println("Da sua thanh cong");
    }



    @Override
    public void delete(int id) {
        if (findIndexById(id) != -1) {
            list.remove(findIndexById(id));
        } else {
            System.out.println("Khong co!");
        }

    }

    @Override
    public Role findById(int id) {
      return list.get(findIndexById(id));
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0 ; i<list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void showAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------");
    }

//    @Override
//    public int findByName(String name) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getName().equals(name)) {
//                System.out.println(list.get(i));
//                return i;
//            }
//        }
//        return -1;
//    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
