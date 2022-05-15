package penguin.object.oriented.human;

public class Boxer extends Human {
    public Boxer(String name, String surname, long id) {
        super(name, surname, id);
    }

    public Boxer() {
    }

    @Override
    public void fight(Human human) {
        System.out.println(this + " is punching " + human);
    }

    @Override
    public void defend(Human human) {
        System.out.println(this + " is blocking");
    }
}
