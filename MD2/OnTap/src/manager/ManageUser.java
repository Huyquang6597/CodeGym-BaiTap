package manager;

import file.FileUserCSV;
import object.Users;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ManageUser implements GeneralManage<Users> {
    List<Users> usersList = new ArrayList<>();
    public static Users currentUser = null;

    public ManageUser() throws FileNotFoundException {
        usersList = FileUserCSV.readFromFile();
    }

    public int login(String username, String password) {
        for (Users users : usersList) {
            if (users.getUsername().equals(username) && users.getPassword().equals(password)) {
                currentUser = users;
                return 1;
            }
        }
        return 0;
    }
public List<Users>  getUsersList(){
        return usersList;
}
public void setUsersList(List<Users> usersList){
        this.usersList = usersList;
}

    @Override
    public void add(Users users) {
        usersList.add(users);
    }

    @Override
    public void edit(int id, Users users) {
        int indexOfId = findIndexById(id);
        if (indexOfId == -1) {
            System.out.println("Khong co!");
        } else {
            usersList.set(indexOfId, users);
        }
        System.out.println("Da sua thanh cong");
    }

    @Override
    public void delete(int id) {
        if (findIndexById(id) != -1) {
            usersList.remove(findIndexById(id));
        } else {
            System.out.println("Khong co!");
        }
    }

    @Override
    public Users findById(int id) {
        return usersList.get(findIndexById(id));
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void showAll() {
        for (int i = 0; i < usersList.size(); i++) {
            System.out.println(usersList.get(i));
        }
    }

//    @Override
//    public int findByName(String Name) {
//        return 0;
//    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
