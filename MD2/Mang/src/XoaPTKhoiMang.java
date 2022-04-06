import java.util.Scanner;

public class XoaPTKhoiMang {
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


        System.out.println("Nhap vao so can xoa: ");
        int soCanXoa = scanner.nextInt();
        int viTriCanXoa = timViTriPhanTu(array, soCanXoa);

        int[] newArr = new int[array.length - 1];
        for (int i = 0; i < viTriCanXoa; i++) {
            newArr[i] = array[i];
        }
        for (int i = viTriCanXoa; i < array.length - 1; i++) {
            newArr[i] = array[i + 1];
        }
        array = newArr;
        inMang(array);
    }

    static int timViTriPhanTu(int[] arrr, int soCanTim) {
        int viTri = -1;
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i] == soCanTim) {
                viTri = i;
            }
        }
        return viTri;
    }

    static void inMang(int[] mang) {
        System.out.println("Mang la: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + "\t");
        }
    }
}
