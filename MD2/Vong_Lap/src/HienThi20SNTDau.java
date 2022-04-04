public class HienThi20SNTDau {
    public static boolean SNT(int n) {
        if (n < 2) {
            return false;
        }
        String s = "SNT";
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                s = "KPSNT";
            }
        }
        if (s == "SNT") {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là: ");
        int count = 0;
        for (int i = 0; count < 20; i++) {
            if (SNT(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
    }
}
