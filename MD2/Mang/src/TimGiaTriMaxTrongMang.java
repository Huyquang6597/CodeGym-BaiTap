import java.util.Scanner;

public class TimGiaTriMaxTrongMang {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size = sc.nextInt();
        int []array = new int [size];

        for (int i = 0;i<array.length;i++){
        if(size>20){
            System.out.println("Size should not exceed 20");
        }
        }
        for (int i = 0;i<array.length;i++){
            System.out.println("Enter element"+ (i+1)+": ");
            array[i]=sc.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){

            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);

    }
}
