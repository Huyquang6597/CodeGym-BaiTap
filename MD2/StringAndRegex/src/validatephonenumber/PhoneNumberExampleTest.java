package validatephonenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExampleTest {


    static boolean validate(ValidatePhoneNumber validatePhoneNumber, String string) {
        Pattern pattern = Pattern.compile(validatePhoneNumber.getRegex());
        Matcher matcher = pattern.matcher(string);
        if (!matcher.matches()) {
            System.out.println(validatePhoneNumber.getMessage());
        } else {
            System.out.println("Nhap Dung!");
        }
        return matcher.matches();
    }
}

class Test {
    public static void main(String[] args) {
        PhoneNumberExampleTest phoneNumberExampleTest = new PhoneNumberExampleTest();
        final String PHONE_NUMBER_REGEX = "84+\\d{9}";
        final String NOT_VALID_CLASS_NAME_MESSAGE = "Nhap chua dung dinh dang!!!";

        Scanner sc = new Scanner(System.in);
        boolean check = false;
        while (check == false) {
            System.out.println("Nhap vao SDT dang (84)-(xxxxxxxxx) : ");
            String phoneNumber = sc.nextLine();
            ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber(PHONE_NUMBER_REGEX, NOT_VALID_CLASS_NAME_MESSAGE);
            check = phoneNumberExampleTest.validate(validatePhoneNumber, phoneNumber);
        }
    }

}

