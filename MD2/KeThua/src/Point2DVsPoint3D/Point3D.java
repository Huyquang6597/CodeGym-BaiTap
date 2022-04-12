package Point2DVsPoint3D;

import java.util.Scanner;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {super.getX(), super.getY(), this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + this.z + ")";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so x: ");
        float x = scanner.nextFloat();
        System.out.println("Nhap so y: ");
        float y = scanner.nextFloat();
        System.out.println("Nhap so z: ");
        float z = scanner.nextFloat();
        Point2D point2 = new Point3D(x,y,z);
        System.out.println(point2);
    }
}
