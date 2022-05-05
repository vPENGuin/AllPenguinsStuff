package penguin.object.oriented.animal;

import penguin.object.oriented.animal.child.Bulldog;
import penguin.object.oriented.animal.child.DwarfHamster;
import penguin.object.oriented.animal.child.Retriever;
import penguin.object.oriented.animal.child.Sphynx;
import penguin.object.oriented.animal.parent.Duck;
import penguin.object.oriented.animal.parent.Giraffe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bulldog bobik = new Bulldog("Bobik", 2);
        Retriever laska = new Retriever("Laska", 6);
        Giraffe jhonas = new Giraffe("Jhonas", 7, 142);
        Sphynx lysik = new Sphynx("Lysik", 3);
        Duck utochka = new Duck("Utochka", 1);
        DwarfHamster homya = new DwarfHamster("Homya", 1);


        List<Animal> animalArray = new ArrayList<>();
        animalArray.add(bobik);
        animalArray.add(laska);
        animalArray.add(jhonas);
        animalArray.add(lysik);
        animalArray.add(utochka);
        animalArray.add(homya);

        for (Animal animal : animalArray) {
            System.out.println(animal);
            animal.sing();
            animal.eat("Steak");
            if (animal instanceof Biteable) {
                Biteable biting = (Biteable) animal;
                biting.bite();
            } else if (animal instanceof Flyable) {
                Flyable flyable = (Flyable) animal;
                flyable.fly();
            }
        }
    }
}

