package calidateclassname;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExampleTest {

    public static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]\\d$";
    public static final String NOT_VALID_CLASS_NAME_MESSAGE = "Nhap ten lop chua dung dinh dang!!!";
    public static final String VALID_CLASS_NAME_MESSAGE = "Nhap ten lop thanh cong!!!";


    public static boolean validate(ClassNameValid classNameValid, String string){
        Pattern pattern = Pattern.compile(classNameValid.getRegex());
        Matcher matcher = pattern.matcher(string);
        if(!matcher.matches()){
            System.out.println(classNameValid.getMessage());
        } else {
            System.out.println(VALID_CLASS_NAME_MESSAGE);
        }

        return matcher.matches();
    }

    public static void main(String[] args) {
        boolean check = false;
        while (check == false) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao ten lop: ");
            String className = sc.nextLine();
            check = validate(new ClassNameValid(CLASS_NAME_REGEX, NOT_VALID_CLASS_NAME_MESSAGE), className);
        }
    }
}

