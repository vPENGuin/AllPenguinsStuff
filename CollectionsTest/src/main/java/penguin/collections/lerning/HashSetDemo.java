package penguin.collections.lerning;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> randomContains = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            int result = random.nextInt(501);
            randomContains.add(result);
            System.out.print(result + ", ");
        }
        System.out.println();

        int[] listOfElements = new int[]{2, 36, 100, 271, 400, 491, 35};
        for (int element : listOfElements) {
            if (randomContains.contains(element)) {
                System.out.println("Random contains element: " + element);
            }
        }
    }
}
