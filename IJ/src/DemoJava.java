import java.util.Scanner;

public class DemoJava {
    public static void main(String[] args) {

//        int a;
//        int b;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào a: ");
//        a = scanner.nextInt();
//        System.out.println("Nhập vào b: ");
//        b = scanner.nextInt();
//        System.out.println("Tổng của chúng là:" + (a + b));

//        int a;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào a:");
//        a = scanner.nextInt();
//        if(a % 2 == 0){
//            System.out.println("Đây là số chẵn");
//        }
//        else {
//            System.out.println("Đây là số lẻ");
//        }

//        int a;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập điểm:");
//        a = scanner.nextInt();
//        if(a < 5 ){
//            System.out.println("Học lực yếu");
//        }
//        if(5 <= a && a <= 8 ) {
//            System.out.println("Học lực Khá");
//        }
//        if(a>8){
//            System.out.println("Học lực giỏi");
//        }

//        for (int i=1; i<=10; i++) {
//            System.out.println(i);
//       }

//        int a;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số a:");
//        a = scanner.nextInt();
//        for(int i = 1;i <= a ;i++){
//        if(i % 2 == 0){
//            System.out.println("Các số chẵn từ 1 tới a là:" + i );
//        }
//        }


        int a;
        int b;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        a = scanner.nextInt();
        System.out.println("Nhập số b");
        b = scanner.nextInt();
        for (int i=a; i<=b; i++) {
            c = c + i;
        }
        System.out.println("Tổng các số từ a đến b là:" + c);
    }
}
