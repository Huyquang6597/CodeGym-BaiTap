package Point2DVsPoint3D;

import java.util.Scanner;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){

    }
    public Point2D(float x , float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x , float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float [] arr = {x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" + "x=" + x + ", y=" + y + '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so x: ");
        float x = scanner.nextFloat();
        System.out.println("Nhap so y: ");
        float y = scanner.nextFloat();
        Point2D point1 = new Point2D(x,y);
        System.out.println(point1);
    }

}

