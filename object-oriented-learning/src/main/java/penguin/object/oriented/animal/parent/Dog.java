package penguin.object.oriented.animal.parent;

import penguin.object.oriented.animal.Animal;
import penguin.object.oriented.animal.Biteable;

public abstract class Dog extends Animal implements Biteable {
    String genus;
    String muzzle;
    String coatLength;

    public Dog(String name, int age, String genus, String muzzle, String coatLength) {
        super(name, age);
        this.genus = genus;
        this.muzzle = muzzle;
        this.coatLength = coatLength;
    }

    @Override
    public void sing() {
        System.out.println("woof");
    }

    @Override
    public void bite() {
        System.out.println("Af!!! Kusau nahooy!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genus='" + genus + '\'' +
                ", muzzle='" + muzzle + '\'' +
                ", coatLength='" + coatLength + '\'' +
                '}';
    }
}
