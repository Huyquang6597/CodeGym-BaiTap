package ThucHanhStaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    // constructor to initialize the variable (hàm tạo để khởi tạo biến)
    Student(int r , String n){
        rollno = r;
        name = n;
    }
    //static method to change the value of static variable (phương thức static để thay đổi giá trị của biến static)
    static void change(){
        college = "CODEGYM";
    }

    //method to display values (phương pháp hiển thị giá trị)
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }



//public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); //gọi phương thức thay đổi

        //creating objects (Tạo đối tượng)
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222 , "Hoa");
        Student s3 = new Student(333 , "Hung");
        Student s4 = new Student(444 , "Huong");

        //calling display method (Gọi phương thức hiển thị)
        s1.display();
        s2.display();
        s3.display();

    }
}


