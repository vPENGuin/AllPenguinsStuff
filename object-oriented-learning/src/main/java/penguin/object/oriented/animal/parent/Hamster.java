package penguin.object.oriented.animal.parent;

import penguin.object.oriented.animal.Animal;
import penguin.object.oriented.animal.Biteable;

public abstract class Hamster extends Animal implements Biteable {
    String size;

    public Hamster(String name, int age, String size) {
        super(name, age);
        this.size = size;
    }

    @Override
    public void sing() {
        System.out.println("SSSSSSSSSSS");
    }

    @Override
    public void bite() {
        System.out.println("Tssa!!!");
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                '}';
    }
}
