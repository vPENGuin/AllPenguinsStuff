package penguin.object.oriented.penguin.model;

//ПРЕДОК - общий класс, общее описание чего-то
//для того, чтобы объявлять общие поля и методы

//добавляем abstract, чтобы нельзя было создать
// объекты неопределенного типа
public abstract class Penguin extends Animal implements Swimming {
    protected int age;
    protected String name;
    protected String genus;

    public Penguin(int age, String name, String genus) {
        this.age = age;
        this.name = name;
        this.genus = genus;
    }

    public Penguin() {
    }

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

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    // делаю абстракт, потому что мне не нужна стандартная, непонятная реализация
    // И я хочу, чтобы все дети реализовывали эту логику
    public abstract void saySomething();

    @Override
    public void swim() {
        System.out.println("I'm swimming as a penguin");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", genus='" + genus + '\'' +
                '}';
    }
}
