package penguin.object.oriented.animal.parent;

import penguin.object.oriented.animal.Animal;
import penguin.object.oriented.animal.Biteable;

public class Giraffe extends Animal implements Biteable {
    int neckLong;

    public Giraffe(String name, int age, int neckLong) {
        super(name, age);
        this.neckLong = neckLong;
    }

    @Override
    public void sing() {
        System.out.println("*Whistle*");
    }

    @Override
    public void bite() {
        System.out.println("Hrum!!!");
    }

    @Override
    public String toString() {
        return "Giraffe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", neckLong=" + neckLong +
                '}';
    }
}
