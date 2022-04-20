package BaiTap;

import java.util.ArrayList;
import java.util.List;

public class ProductManager implements Manager<Product> {
    private List<Product> productsList = new ArrayList<>();

    @Override
    public void add(Product product) {

        productsList.add(product);
    }

    @Override
    public void edit(int id, Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void display() {
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println(productsList.get(i));
        }
    }

    @Override
    public int findById(int id) {
        for (int i = 0 ;)
        return 0;
    }

//    public ProductManager() {
//        this.products = new ArrayList<>();
//    }


//
//    public int findByName(String name){
//        for (int i = 0 ; i<products.size(); i++){
//            if(products.get(i).getName().equals(name)){
//                System.out.println(products.get(i));
//                return i;
//            }
//        }
//        return -1;
//    }
//    public int findById(int id){
//        for (int i = 0 ; i<products.size(); i++){
//            if(products.get(i).getName().equals(id)){
//                System.out.println(products.get(i));
//                return i;
//            }
//        }
//        return -1;
//    }
//
//
//    public void edit(int id , Product product2){
//        int indexOfProduct =
//    }
}
