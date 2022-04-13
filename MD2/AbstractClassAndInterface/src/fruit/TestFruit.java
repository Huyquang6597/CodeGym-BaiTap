package fruit;
import fruit.Fruit;
import fruit.Apple;
import fruit.Orange;
import edible.Edible;

public class TestFruit {
    public static void main(String[] args) {
        Fruit[] fruits =  new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (fruit.Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
