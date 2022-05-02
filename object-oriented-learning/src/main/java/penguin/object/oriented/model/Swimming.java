package penguin.object.oriented.model;

// абстрактные методы, которые ОБЯЗАТЕЛЬНО нужно реализовать
// если реализуешь этот интерфейс
public interface Swimming {
    // константы
    String DEFAULT_VALUE = "Swimmer";

    void swim();

    // можно указать реализацию в интерфейсе. default
    default void defaultSwimming() {
        System.out.println("I'm swimming by default");
    }
}
