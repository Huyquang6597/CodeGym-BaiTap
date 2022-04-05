import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter a Student name");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if(students[i].equals(input_name)){
                System.out.println("Position of the students in the list is" + "" + (i+1) );
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found " + input_name + "in the list");
        }
    }
}
