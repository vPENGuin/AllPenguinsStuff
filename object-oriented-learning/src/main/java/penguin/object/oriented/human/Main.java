package penguin.object.oriented.human;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Boxer boxer = new Boxer("Moxim", "Romanich", 0);
        Karateka karateka = new Karateka("nePenguin", "Penguinov", 1);

        boxer.fight(karateka);
        karateka.defend(new Boxer("Junk", "Junkov", 6));
        for (int i = 0; i < 5; i++) {
            karateka.fight(boxer);
        }
        System.out.println("Fight is over!");

        Kicker kicker1 = new Karateka("kicker", "1", 2);
        Kicker kicker2 = new Karateka("kicker", "2", 3);
        Kicker kicker3 = new Karateka("kicker", "3", 4);

        ArrayList<Kicker> kickers = new ArrayList<>();

        kickers.add(kicker1);
        kickers.add(kicker2);
        kickers.add(kicker3);

        for (Kicker kicker : kickers) {
            kicker.axe(karateka);
        }

    }
}
