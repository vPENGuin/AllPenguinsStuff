package penguin.object.oriented.animal.parent;

import penguin.object.oriented.animal.Animal;
import penguin.object.oriented.animal.Flyable;

public class Duck extends Animal implements Flyable {
    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly(){
        System.out.println("I'm gonna fly as duck!");
    }

    @Override
    public void sing() {
        System.out.println("Qrya");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
