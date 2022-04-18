package FamilyManagement;

public class Person {
    private String name;
    private int age;
    private String job;
    private long identityCard;
    private String address;
    private int familyMember;

    public Person() {
    }

    public Person(String name, int age, String job, long identityCard , String address , int familyMember) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.identityCard = identityCard;
        this.address = address;
        this.familyMember = familyMember;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public long getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(long identityCard) {
        this.identityCard = identityCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(int familyMember) {
        this.familyMember = familyMember;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", job='" + job + '\'' + ", identityCard=" + identityCard + ", address='" + address + '\'' + ", familyMember=" + familyMember + '}';
    }
}
