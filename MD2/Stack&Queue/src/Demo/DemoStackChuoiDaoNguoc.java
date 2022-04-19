package Demo;

import java.util.*;

public class DemoStackChuoiDaoNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //stackChuoi.push("giải trí") ==> đưa giá trị vào stack
        //stackChuoi.pop() ==> xóa và lấy giá trị cuối ra
        //stackChuoi.peek() ==> lấy giá trị ra nhưng k xóa khỏi stack
        //stackChuoi.contains("giaitri" ==> xác định giá trị có tồn tại trong stack hay k
        //stackChuoi.clear() ==> xóa tất cả các phần tử trong stack
        //stackChuoi.size() ==> độ lớn của stack

        //Ví dụ đảo ngược chuỗi

        Stack<String> stackChuoi = new Stack<>();
        System.out.println("Nhap chuoi");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i) + "");
        }
        System.out.println("Chuoi dao nguoc");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());
        }
        System.out.println();

        //Ví dụ chuyển từ hệ thập phân sang hệ nhị phân

        Stack<String> stackSoDu = new Stack<>();
        System.out.println("Nhap 1 so nguyen duong tu ban phim");
        int x = sc.nextInt();
        while (x > 0) {
            int soDu = x % 2;
            stackSoDu.push(soDu + "");
            x = x / 2;
        }
        System.out.println("So nhi phan la: ");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackSoDu.pop());
        }
        System.out.println();

        //ví dụ tách số có nhiều chữ số thành các chữ số

        System.out.println("Nhap vao so muon tach : ");
        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextInt();
        Stack<Integer> numStack = new Stack<>();
        Queue<Integer> numQueue = new LinkedList<>();
        while (num > 0) {
            numQueue.add(num % 10);
            num = num / 10;
        }
        while (!numQueue.isEmpty()) {
            numStack.push(numQueue.remove());
        }
        while (!numStack.isEmpty()) {
            System.out.println(numStack.pop());
        }


        //ví dụ kiểm tra chuỗi đối xứng

        System.out.println("Nhap vao chuoi can kiem tra: ");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Queue queue = new LinkedList();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("Day la chuoi doi xung.");
        else
            System.out.println("Day khong phai la chuoi doi xung.");
    }
}


