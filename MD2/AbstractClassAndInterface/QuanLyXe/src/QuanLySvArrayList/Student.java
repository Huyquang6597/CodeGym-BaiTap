package QuanLySvArrayList;

public class Student implements Comparable<Student> {
    private int score;
    private int id;
    private String name;
    private int age;

    public Student(){
    }

    public Student(String name, int id, int age, int score) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }


    @Override
    public String toString() {
        return "Students{" + "Name: " + name + ", Id: " + id + ", Age: " + age + ", score = " + score + '}';
    }
}
