package penguin.object.oriented.animal;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public void eat(String food) {
        System.out.println("Я ем " + food);
    }

    public abstract void sing();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "Name:" + name +
                ", Age='" + age + '\'' +
                '}';
    }
}
