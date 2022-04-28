package staffmananger;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
//        File file = new File("ListStaff.csv");
//        file.createNewFile();

        Menu menu = new Menu();
        menu.menuMain();

    }
}
