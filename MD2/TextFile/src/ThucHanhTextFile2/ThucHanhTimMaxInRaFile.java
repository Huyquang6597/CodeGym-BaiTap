package ThucHanhTextFile2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThucHanhTimMaxInRaFile {
    public static void main(String[] args) throws IOException {
        //Tạo file txt mới
        File inputFile = new File("input.txt");
        inputFile.createNewFile();
        File outputFile = new File("output.txt");
        outputFile.createNewFile();
        PrintWriter printWriter = new PrintWriter(outputFile);
        Scanner scanner = new Scanner(inputFile);
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) { //kiểm tra xem đằng sau còn trống không
            integers.add(scanner.nextInt());
        }
        int max = integers.get(0);
        for (int i : integers) {
            if (max < i) {
                max = i;
            }
        }
        printWriter.println("Max la: " + max);
        printWriter.close();
    }
}