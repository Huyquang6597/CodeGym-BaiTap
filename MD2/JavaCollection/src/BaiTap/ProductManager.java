package BaiTap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager implements Manager<Product> {
    private List<Product> productsList = new ArrayList<>();

    @Override
    public void add(Product product) {

        productsList.add(product);
    }

    @Override
    public void edit(int id, Product product) {
    if(findById(id) != -1) {
        productsList.set(findById(id), product);
    } else {
        System.out.println("Khong co!");
    }
    }

    @Override
    public void delete(int id) {
        if(findById(id) != -1) {
            productsList.remove(findById(id));
        } else {
            System.out.println("Khong co!");
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println(productsList.get(i));
        }
    }

    @Override
    public int findById(int id) {
        for (int i = 0 ; i<productsList.size(); i++){
            if(productsList.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }


    @Override
    public int findByName(String name) {
        for (int i = 0 ; i<productsList.size(); i++){
            if(productsList.get(i).getName().equals(name)){
                System.out.println(productsList.get(i));
                return i;
            }
        }
     return -1;

    }

    @Override
    public int sortByPrice(int price) {
        System.out.println("Sau khi sap xep : ");
        Collections.sort(this.productsList);
        return 0;
    }


}
