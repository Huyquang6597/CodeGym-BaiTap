package classanimal_and_interfaceEdible;
import classanimal_and_interfaceEdible.animal;
import classanimal_and_interfaceEdible.Chicken;
import classanimal_and_interfaceEdible.Tiger;
import edible.Edible;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        animal[] animals = new animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (classanimal_and_interfaceEdible.animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
