package penguin.object.oriented.object;

import penguin.object.oriented.animal.parent.Duck;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Object - все классы наследуются от Object
        // зачем? стандарт. мы точно знаем,
        // что если это объект, то это Object

        // Duck {1, "Kryakva", "..."}.hashCode() --> 551254
        // Duck {1, "Kryakva", "..."}.hashCode() --> 551254
        // Duck {2, "Red", "..."}.hashCode() --> 12312

        Duck kryakva = new Duck("Kryakva", 5);
        Duck kryakva1 = new Duck("Kryakva", 5);
        Duck red = new Duck("Red", 10);

        System.out.println(kryakva.hashCode());
        System.out.println(kryakva1.hashCode());
        System.out.println(red.hashCode());

        HashMap<Duck, Integer> hashMap = new HashMap<>();

        // index = 460141958
        hashMap.put(kryakva, kryakva.getAge()); // [{new Duck("Kryakva", 5)}]
        hashMap.get(kryakva1); // kryakva1.hashCode() --> 1163157884

        System.out.println(kryakva);
    }
}
