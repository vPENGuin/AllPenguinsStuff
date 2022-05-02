package penguin.object.oriented.model;

public class Fish extends Animal implements Swimming {
    @Override
    public void swim() {
        defaultSwimming();
        System.out.println("I'm swimming as a fish");
    }
}
