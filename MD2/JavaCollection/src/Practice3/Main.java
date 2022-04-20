package Practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien" , 24 ,"rggsef");
        Student student1 = new Student("Huy" , 25 , "gfdgd");
        Student student2 = new Student("Hoang" , 53 , "dsfsgs");

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        Collections.sort(list);
        for (Student st : list){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi");
        for (Student st : list){
            System.out.println(st.toString());
        }
    }

}
