package FamilyManagement;

import java.util.ArrayList;

public class Family extends Person {
    ArrayList<Person> people;


    public Family() {
        this.people = new ArrayList<>();
    }

    public void add(Person persons){
        people.add(persons);
    }

    public int findByName(String name){
        for (int i = 0 ; i < people.size(); i++){
            if(people.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void display(){
        for (int i = 0; i< people.size(); i++){
            System.out.println(people.get(i));
        }
        System.out.println("-----------------------");
    }

    public void delete(String name){
        int indexOfPeople = findByName(name);
        if(indexOfPeople == -1){
            System.out.println("Không tìm thấy tên người này!");
        } else {
            people.remove(indexOfPeople);
        }
    }
}
