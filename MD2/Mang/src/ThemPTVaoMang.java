import java.util.Scanner;

public class ThemPTVaoMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang: ");
        size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Gia tri cua phan tu: " + (i + 1));
            array[i] = scanner.nextInt();
        }


        System.out.println("Nhap vao so can them: ");
        int soCanThem = scanner.nextInt();
        System.out.println("Them vi tri can them: ");
        int viTriCanThem = scanner.nextInt();

        int[] newArr = new int[array.length + 1];
        for (int i = 0; i < viTriCanThem; i++) {
            newArr[i] = array[i];
        }
        newArr[viTriCanThem] = soCanThem;
        for (int j = viTriCanThem+1; j < newArr.length ; j++) {
            newArr[j] = array[j - 1];
        }
//        array = newArr;
//        inMang(array);

        for (int x = 0; x < newArr.length; x++) {
            System.out.println(newArr[x]);
        }

    }

//    static int timViTriPhanTu(int[] arrr, int soCanTim) {
//        int viTri = 0;
//        for (int i = 0; i < arrr.length; i++) {
//            if (arrr[i] == soCanTim) {
//                viTri = i;
//            }
//        }
//        return viTri;
//    }

    static void inMang(int[] mang) {
        System.out.println("Mang la: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + "\t");
        }
    }
}
