package demo;

public class Student {
    private int id , age;
    private String name;

    public Student(){

    }
    public Student(int id , int age , String name){
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Student{" + "id=" + id + ", age=" + age + ", name='" + name + '\'' + '}';
//    }
}
