import java.util.Scanner;

public class TimPhanTuMaxTrongMang2Chieu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong: ");
        int dong = scanner.nextInt();
        System.out.println("Nhap vao so cot: ");
        int cot = scanner.nextInt();

        int[][] arr = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Nhap phan tu thu [" + i + "," + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("In ra mang: ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max = arr[0][0];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }

        }
        System.out.println("gia tri lon nhat mang 2 chieu nay la: " + max);
    }
}
