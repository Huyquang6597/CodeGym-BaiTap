package InterfaceComparable;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());

        System.out.println("Truoc khi thay doi: ");
        for (Shape i : shapes){
            System.out.println(i.toString());
            if (i instanceof Circle){
                System.out.println("Dien tich truoc khi thay doi: " + ((Circle) i).getArea());
            }
            else if (i instanceof Rectangle) {
                System.out.println("Diện tích trước khi thay đổi:" + ((Rectangle) i).getArea());

            }
            else {
                System.out.println("Lỗi!!!");
            }
        }
        System.out.println("Sau khi thay đổi: ");
        long rd = Math.round(Math.random()*100);
        System.out.println("Random = " + rd);
        for (Shape i : shapes) {
            System.out.println(i.toString());
            if (i instanceof Circle) {
                i.resizeable(rd);
                System.out.println("Diện tích sau khi thay đổi: " + ((Circle) i).getArea());
            }
            else if (i instanceof Rectangle) {
                if (i instanceof Square) {
                    ((Square) i).howToColor();
                }
                i.resizeable(rd);
                System.out.println("Diện tích sau khi thay đổi: " + ((Rectangle) i).getArea());

            }
            else {
                System.out.println("Lỗi!!!");
            }
        }

    }
}
