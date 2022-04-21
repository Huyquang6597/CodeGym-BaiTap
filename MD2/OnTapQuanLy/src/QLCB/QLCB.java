package QLCB;

import java.util.ArrayList;
import java.util.List;

public class QLCB implements QuanLy<CanBo> {
    private List<CanBo> canBoArrayList = new ArrayList<>();

    @Override
    public void add(CanBo canBo) {
        canBoArrayList.add(canBo);
    }


    @Override
    public void display() {
        for (int i = 0; i < canBoArrayList.size(); i++) {
            System.out.println(canBoArrayList.get(i));
        }
        System.out.println("=====================");
    }

    @Override
    public int findByName(String name) {
       for (int i = 0 ; i < canBoArrayList.size(); i++){
           if(canBoArrayList.get(i).getName().equals(name)){
               System.out.println(canBoArrayList.get(i));
               return i;
           }
       }
       return  -1;
    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
