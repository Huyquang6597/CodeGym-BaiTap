package StaffMananger;

import java.util.ArrayList;
import java.util.List;

public class StaffManager implements Manager<Staff> {
    List<Staff> staffList = new ArrayList<>();


    @Override
    public void show() {
        for (int i = 0; i < staffList.size(); i++) {
            System.out.println(staffList.get(i));
        }
        System.out.println("------------------------");
    }


    @Override
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    @Override
    public void editByName(String name, Staff staff) {
        int indexOfName = findByName(name);
        if (indexOfName == -1) {
            System.out.println("Khong co!");
        } else {
            staffList.set(indexOfName, staff);
        }
    }

    @Override
    public void updateStaffStatus(String name) {

    }

    @Override
    public void printFullTime() {

    }

    @Override
    public void removeByName(String name) {

    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getName().contains(name)) {
                return i;
            }
        }
        return -1;
    }
}
