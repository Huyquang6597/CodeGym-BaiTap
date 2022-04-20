package Practice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 23, "ggsf");
        Student student2 = new Student("Hung", 25, "sggweasf");
        Student student3 = new Student("Hoa", 30, "sdgerd");

        Map<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1, student1);
        hashMap.put(2, student2);
        hashMap.put(3, student3);

        for(Map.Entry<Integer , Student> student : hashMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
