package InterfaceComparable;

public abstract class Shape {
    private String color = "Green";
    private boolean filled = true;

    public Shape(){

    }

    public Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(String color) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}';
    }




    public abstract void resizeable(double percent);
}