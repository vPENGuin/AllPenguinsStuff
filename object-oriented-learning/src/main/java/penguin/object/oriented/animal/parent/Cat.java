package penguin.object.oriented.animal.parent;

import penguin.object.oriented.animal.Animal;
import penguin.object.oriented.animal.Biteable;

public abstract class Cat extends Animal implements Biteable {
    String genus;
    String coatLength;

    public Cat(String name, int age, String genus, String coatLength) {
        super(name, age);
        this.genus = genus;
        this.coatLength = coatLength;
    }

    @Override
    public void sing() {
        System.out.println("Meaw");
    }

    @Override
    public void bite() {
        System.out.println("Bite as Cat");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genus='" + genus + '\'' +
                ", coatLength='" + coatLength + '\'' +
                '}';
    }
}
