package penguin.collections.lerning;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(6);
        nums.add(24);
        nums.add(214);
        nums.add(534);
        nums.add(634);
        nums.add(636);
        nums.add(8657);
        nums.add(52);
        nums.add(876);

        System.out.println(nums);

        nums.remove(7);
        System.out.println(nums);

        nums.remove(new Integer(52));
        System.out.println(nums);

        nums.set(6, 735);
        System.out.println(nums);
    }
}
