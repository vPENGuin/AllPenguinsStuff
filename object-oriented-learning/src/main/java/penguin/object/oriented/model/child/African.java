package penguin.object.oriented.model.child;

import penguin.object.oriented.model.Penguin;

// child - наследник, ребенок
// расширяет свойства предка, добавляет уникальные / специфичные поля,
// которые характерны только конкретным типам
// и свои методы
public class African extends Penguin {
    private double glassesCost;
    /*protected int age;
    protected String name;
    protected String genus;*/

    public African(int age, String name, double glassesCost) {
        super(age, name, "African");
        this.glassesCost = glassesCost;
    }

    public double getGlassesCost() {
        return glassesCost;
    }

    public void setGlassesCost(double glassesCost) {
        this.glassesCost = glassesCost;
    }

    //переопределение. И указываю конкретную реализацию
    @Override
    public void saySomething() {
        System.out.println("I'm African peng! I say hello there!");
    }

    @Override
    public String toString() {
        return super.toString() + " African{" +
                "glassesCost=" + glassesCost +
                '}';
    }
}
