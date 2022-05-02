package penguin.object.oriented.penguin;

import penguin.object.oriented.penguin.model.Fish;
import penguin.object.oriented.penguin.model.Penguin;
import penguin.object.oriented.penguin.model.Swimming;
import penguin.object.oriented.penguin.model.child.African;
import penguin.object.oriented.penguin.model.child.Emperor;

public class Main {
    public static void main(String[] args) {
        African drippyBoi = new African(2, "Drippy boi", 25);
        Emperor sexyBoi = new Emperor(4, "Sexy boi", 69);

        Penguin[] penguinArray = new Penguin[2];
        penguinArray[0] = drippyBoi;
        penguinArray[1] = sexyBoi;

        for (Penguin peng : penguinArray) {
            peng.saySomething();
            System.out.println(peng);
        }

        Swimming swimmer = new Emperor();
        swimmer = new Fish();

        swimmer.swim();

        Fish fish = new Fish();
        Fish fish1 = new Fish();

        boolean equals = fish.equals(fish1);

        Object fish3 = new Fish();

        findType(drippyBoi);
        findType(fish);
        findType("asdasdas");
    }

    // instanceof - проверка типа
    // () - приведение типа
    // Penguin peng - переменная, определяет набор методов и филдов. ЭТИ МЕТОДЫ ТОЧНО ЕСТЬ
    // new African() - конкретный объект, который эти методы реализует. КАК ЭТИ МЕТОДЫ РАБОТАЮТ
    public static void findType(Object something) {
        if (something instanceof Penguin) {
            Penguin thisIsPeng = (Penguin) something;
            thisIsPeng.saySomething();
        } else if (something instanceof Fish) {
            Fish thisIsFish = (Fish) something;
            thisIsFish.defaultSwimming();
        } else if (something instanceof Swimming) {
            Swimming thisCanSwim = (Swimming) something;
            thisCanSwim.swim();
        } else {
            System.out.println("I couldn't find type of object");
        }
    }

    // instanceof - проверка типа
    // () - приведение типа
    public static void findPeng(Penguin somePeng) {
        if (somePeng instanceof African) {
            African african = (African) somePeng;
            double glassesCost = african.getGlassesCost();
        }
    }
}
