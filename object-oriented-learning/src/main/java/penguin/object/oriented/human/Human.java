package penguin.object.oriented.human;

public abstract class Human {
    private String name;
    private String surname;
    private long id;

    public Human(String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public Human() {
    }

    public abstract void fight(Human human);

    public abstract void defend(Human human);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
