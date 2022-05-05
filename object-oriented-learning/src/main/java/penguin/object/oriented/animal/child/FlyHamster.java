package penguin.object.oriented.animal.child;

import penguin.object.oriented.animal.Flyable;
import penguin.object.oriented.animal.parent.Hamster;

public class FlyHamster extends Hamster implements Flyable {
    public FlyHamster(String name, int age, String size) {
        super(name, age, "medium");
    }

    @Override
    public void fly() {
        System.out.println("Letayu nahooy!");
    }
}
