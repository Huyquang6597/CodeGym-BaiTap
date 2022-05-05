package file;

import manager.ManageRole;
import object.Role;
import object.Users;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUserCSV {
    public static List<Users> readFromFile() throws FileNotFoundException {
        ManageRole manageRole = new ManageRole();
        File roleFile = new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/OnTap/user.csv");
        List<Users> users = new ArrayList<>();
        Scanner scanner = new Scanner(roleFile);
        scanner.nextLine();
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            if(line.equals("")){
                break;
            } else {
                String arr[] = line.split(",");
                Role role = manageRole.findById(Integer.valueOf(arr[3]));
                Users user = new Users(Integer.valueOf(arr[0]), arr[1],arr[2],role,arr[4]);
                users.add(user);
            }

        } return users;
     }
    public static void writeToFile(List<Users> list) throws FileNotFoundException {
        File roleFile = new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/CodeGym-BaiTap/MD2/OnTap/src/object/Users.java");
        PrintWriter printWriter = new PrintWriter(roleFile);
        printWriter.print("id,username,password,role,status\n");
        for (int i = 0; i < list.size(); i++) {
           printWriter.print(list.get(i));
        }
        printWriter.close();
    }
}
