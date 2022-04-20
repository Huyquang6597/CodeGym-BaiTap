package Practice3;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()> o2.getAge()){
            return 1;
        } else if (o1.getAge() == o2.getAge()){
            return 0;
        }else {
            return -1;
        }
    }

}
