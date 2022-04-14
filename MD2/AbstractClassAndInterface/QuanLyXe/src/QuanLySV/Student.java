package QuanLySV;

public class Student extends Person {
    private int score;

    public Student() {
    }

    public Student(int score) {
        this.score = score;
    }

    public Student(String name ,int id,  int age, int score) {
        super(id, name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return " Student { Ten: " + getName() + ", Id = " + getId() + " Tuoi = " + getAge() + " Diem: " + score +'}';
    }


}

