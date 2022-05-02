package penguin.object.oriented.penguin.model.child;

import penguin.object.oriented.penguin.model.Penguin;

// child - наследник, ребенок
// расширяет свойства предка, добавляет уникальные / специфичные поля,
// которые характерны только конкретным типам
// и свои методы
public class Emperor extends Penguin {
    private int linesCount;
/*    protected int age;
    protected String name;
    protected String genus;*/

    public Emperor(int age, String name, int linesCount) {
        super(age, name, "Emperor");
        this.linesCount = linesCount;
    }

    public Emperor() {
    }

    public int getLinesCount() {
        return linesCount;
    }

    public void setLinesCount(int linesCount) {
        this.linesCount = linesCount;
    }

    //переопределение. И указываю конкретную реализацию
    @Override
    public void saySomething() {
        System.out.println("I'm an Emperor peng! I say hello guys!");
    }
}
