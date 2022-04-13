package InterfaceComparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[]circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5,"white",false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new  InterfaceComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

    }

}
