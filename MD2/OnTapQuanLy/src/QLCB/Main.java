package QLCB;

public class Main {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        CanBo cb1 = new KySu("Hung", 49, "Nam", "hhhhhh" , "IT");
        CanBo cb2 = new CanBo("Hoang", 37, "Nam", "ggggf");
        CanBo cb3 = new CanBo("Nhu", 39, "Nu", "hhhhhsfh");
        CanBo cb4 = new CanBo("Nhi", 29, "Nu", "324hhhhhh");
        qlcb.add(cb1);
        qlcb.add(cb2);
        qlcb.add(cb3);
        qlcb.add(cb4);
        qlcb.display();

        qlcb.findByName("Hoang");
        qlcb.exit();
        qlcb.display();


    }
}
