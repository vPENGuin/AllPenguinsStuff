package penguin.object.oriented.human;

import java.util.Random;

public class Karateka extends Human implements Kicker {
    public Karateka(String name, String surname, long id) {
        super(name, surname, id);
    }

    public Karateka() {
    }


    @Override
    public void fight(Human human) {
        Random random = new Random();
        int bound = random.nextInt(3);
        switch (bound) {
            case 0:
                tip(human);
                break;
            case 1:
                roundHouse(human);
                break;
            case 2:
                axe(human);
        }
    }

    @Override
    public void defend(Human human) {
        System.out.println(this + " is avoiding");
    }

    @Override
    public void tip(Human human) {
        System.out.println(this + " is tipping " + human);
    }

    @Override
    public void roundHouse(Human human) {
        System.out.println(this + " is round-house kicking " + human);
    }

    @Override
    public void axe(Human human) {
        System.out.println(this + " is axe kicking " + human);
    }
}
