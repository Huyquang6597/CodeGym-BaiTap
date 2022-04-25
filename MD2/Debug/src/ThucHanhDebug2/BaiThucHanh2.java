package ThucHanhDebug2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaiThucHanh2 {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
    }

