package BaiTap;

public class Main {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        Product product = new Product("May giat", 222, 20000000);
        Product product1 = new Product("O to", 333, 2000000000);
        Product product2 = new Product("Xe may", 323, 210000000);
        pm.add(product);
        pm.add(product1);
        pm.add(product2);
        pm.display();
//        Product product3 = new Product("aaaa", 4444, 354353424);
//        pm.edit(222, product3);
//        pm.display();
        pm.sortByPrice(product.getProductPrice());
        pm.display();
    }
}