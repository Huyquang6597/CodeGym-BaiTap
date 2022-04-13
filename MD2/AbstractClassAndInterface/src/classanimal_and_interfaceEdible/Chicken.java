package classanimal_and_interfaceEdible;
import edible.Edible;
public class Chicken extends animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
