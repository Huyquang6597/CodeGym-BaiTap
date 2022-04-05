import java.util.Scanner;

public class Daonguoc_PhanTuMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] src = {2, 5, 6, 1, 4,9};
        for (int i = src.length - 1; i >= 0; i--) {
            System.out.println(src[i]);
        }
    }
}
