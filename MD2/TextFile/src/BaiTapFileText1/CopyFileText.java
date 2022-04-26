package BaiTapFileText1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        File inputFile1 = new File("Test1.txt");
        inputFile1.createNewFile();
        File outputFile1 = new File("Test2.txt");
        outputFile1.createNewFile();
        PrintWriter pw = new PrintWriter(outputFile1);
        FileReader file1 = new FileReader(inputFile1);
        int a ;
        int count = 0;
        while ((a = file1.read()) != -1){ //-1 là giá trị cuối cùng trong read()
            pw.print((char) a);
            count++;

        }
        pw.close();
        System.out.println(count);

    }
}
