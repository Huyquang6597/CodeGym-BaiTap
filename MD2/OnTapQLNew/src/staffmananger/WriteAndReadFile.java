package staffmananger;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class WriteAndReadFile {
    StaffManagement staffManagement1 = new StaffManagement();

    public WriteAndReadFile() throws Exception {
    }

    public void writeFile(String filePath1, List<Staff> list) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final String filePath = "ListStaff.csv";
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);
            String s = "Ten,Loai,Hien trang,Luong\n";
            bw.write(s);
            for (Staff ss : list) {
                bw.write(ss.getName() + "," + ss.getType() + "," + ss.getStatus() + "," + ss.getSalary() + '\n');
            }

            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void readFile(String filePath1, List<Staff> list) throws Exception {
        FileReader fr = new FileReader(filePath1);

        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(filePath1));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                list.add(new Staff(arr[0], Boolean.parseBoolean(arr[1]), Boolean.parseBoolean(arr[2]), Long.parseLong(arr[3])));
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

//public void writeList(String filePath1, List<Staff> list) throws FileNotFoundException {
//        FileReader fileReader = new FileReader(filePath1);
//        Scanner sc1 = new Scanner(fileReader);
//        String[]arr;
//        while (sc1.hasNext()){
//            arr = sc1.nextLine().split(",");
//            Staff staff = new Staff(arr[0] , Boolean.parseBoolean(arr[1]),Boolean.parseBoolean(arr[2]), Long.parseLong(arr[3]));
//            try {
//                for (Staff s: list) {
//
//                }
//            } catch (Exception e){
//
//            }
//        }
//}

}