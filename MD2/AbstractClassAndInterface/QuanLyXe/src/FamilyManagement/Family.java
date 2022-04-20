package FamilyManagement;

import java.util.ArrayList;

public class Family extends Person {
    ArrayList<Person> people;


    public Family() {
        this.people = new ArrayList<>();
    }

    public void add(Person persons) {
        people.add(persons);
    }

    public int findByName(String name) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals(name)) {
                System.out.println(people.get(i));
                return i;
            }
        }
        return -1;
    }

    public void delete(String name) {
        int indexOfPeople = findByName(name);
        if (indexOfPeople == -1) {
            System.out.println("Khong tim thay ten nguoi nay!");
        } else {
            people.remove(indexOfPeople);
        }
    }

    public void edit(String name, Person people1) {
        int intdexOfPeople = findByName(name);
        if (intdexOfPeople == -1) {
            System.out.println("Khong co nguoi nay!");
        } else {
            people.set(intdexOfPeople, people1);
        }
    }

    public void display() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        System.out.println("-----------------------");
    }

    public void displayMinAge() {
        int minAge = people.get(0).getAge();
        int indexOfMin = -1;
        for (int i = 0; i < people.size(); i++) {
           if(minAge > people.get(i).getAge()){
               minAge = people.get(i).getAge();
               indexOfMin = i;

           }
        }
        System.out.println(indexOfMin);
        System.out.println("-----------------------");
    }

}
