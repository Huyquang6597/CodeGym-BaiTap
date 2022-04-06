import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
//        int size;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so luong phan tu mang: ");
//        size = scanner.nextInt();
//        int[] array = new int[size];
//        for (int i = 0;i<size;i++){
//            System.out.println("Nhap phan tu "+ i +": ");
//            array[i]=scanner.nextInt();
//        }
//        System.out.print("In ra mang: ");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
//        int min = array[0];
//        int index = 1;
//        for (int j = 0; j < array.length; j++){
//
//            if (array[j] < min) {
//                min = array[j];
//                index = j + 1;
//            }
//        }
//        System.out.println("Gia tri nho nhat trong mang la: " + min + " ,tai vi tri " + index);




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
                int min = arr[0][0];
                for (int i = 0; i < dong; i++) {
                    for (int j = 0; j < cot; j++) {
                        if (min > arr[i][j]) {
                            min = arr[i][j];
                        }
                    }

                }
                System.out.println("gia tri nho nhat mang 2 chieu nay la: " + min);
            }
        }




