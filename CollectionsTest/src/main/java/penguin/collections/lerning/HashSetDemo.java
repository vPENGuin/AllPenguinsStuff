package penguin.collections.lerning;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<Integer> randomContains = new HashSet<>();
        for (int i = 0; i < 200; i++){
            Random random = new Random();
            int result = random.nextInt(500);
            randomContains.add(result);
            System.out.print(result + ", ");
        }
        System.out.println();

        int[] listOfElements = new int[]{2, 36, 100, 271, 400, 491, 35};
        for (int elements: listOfElements) {
            if (randomContains.contains(elements)){
                System.out.println("Random contain element: " + elements);
            }
        }
//        System.out.println(randomContains.contains(elements));
    }

}
