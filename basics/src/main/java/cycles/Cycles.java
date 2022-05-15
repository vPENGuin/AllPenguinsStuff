package cycles;

public class Cycles {
    public static void main(String[] args) {
        // for - точка старта, конечная точка, как изменяется переменная (итерация)
            // int i = 0; i < 100; i += 10

        //for (int i ....)

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        String[] strings = new String[]{"123", "456"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        // while - пока выполняется условие. if - условный оператор
        // if (условие - boolean)

        // i == 100 true/false - boolean

        // сначала проверить, потом сделать

        boolean running = true;
        while (running) {
            running = false;
            System.out.println("runnnnnn");
        }

        // do while - хотя бы один раз. Сначала сделать, потом проверить

        boolean isRunning = false;
        do {
            System.out.println("fassst");
        } while (isRunning);

        // foreach - обхода коллекций И массивов и всего, что можно обойти
        // 0 1 2 3 4 5 6 ...
        for (String string : strings) {
            System.out.println(string);
        }

/*        SuperPuperTree tree = new SuperPuperTree();
        for (Object object : tree) {
            System.out.println(object);
        }*/
    }
}
