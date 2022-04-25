package ThucHanhDebug2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BaiThucHanh2 arrExample = new BaiThucHanh2();
        Integer[] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("Vui long nhap chi so cua mot phan tu bat ky: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so " + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chi so vuot qua gioi han cua mang");
        }
    }
}

