package arrays;

/*
* 1. Найти минимальное значение в массиве
* 5 3 8 15 2
* результат 2
*/

public class MinValue {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 3, 8, 15, 2};

        System.out.println(min(nums));
    }

    public static int min(int[] nums){
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
}
