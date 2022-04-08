package Circle;

public class Circle {
private double radius ;
//private String color = "red";

    public Circle(){

    }


    public Circle(double radius) {
        this.radius = radius;
//        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;

    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }


}

