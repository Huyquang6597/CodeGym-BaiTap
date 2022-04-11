package ClassCircle;

public class Cylinder extends Circle {
    private double h;

    public Cylinder() {

    }

    public Cylinder(double h) {
        this.h = h;
    }

    public Cylinder(double h, double radius, String color) {
        super(radius, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "h=" + h + '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder();
    }
}
