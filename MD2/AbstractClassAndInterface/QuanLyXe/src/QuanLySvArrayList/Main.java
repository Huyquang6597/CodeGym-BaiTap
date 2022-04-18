package QuanLySvArrayList;

public class Main {
    public static void main(String[] args) {
        QuanLyS quanLyS = new QuanLyS();
        quanLyS.add(new Student("Hoa" , 111, 23 , 30));
        quanLyS.add(new Student("Huy" , 1133, 27 , 31));
        quanLyS.add(new Student("Hung" , 11356, 25 , 32));
        quanLyS.add(new Student("Hoang" , 113366, 43 , 333));
        quanLyS.display();
//        System.out.println(quanLyS.findByName("Huy"));
//        quanLyS.edit("Hoa", new Student("Huong" , 112 , 29 , 30));
//        quanLyS.display();
//        quanLyS.delete("Huy");
//        quanLyS.display();
        quanLyS.sortByAge();
        quanLyS.display();
    }
}
