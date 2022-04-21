package BaiTap;

public class Product implements Comparable<Product>{
    private String name;
    private int id;
    private int productPrice;

    public Product() {
    }

    public Product(String name, int id, int productPrice) {
        this.name = name;
        this.id = id;
        this.productPrice = productPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getProductPrice() - o.getProductPrice();
    }
}
