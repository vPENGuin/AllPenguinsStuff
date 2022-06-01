package arrays;

public class OddCount {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 3, 8, 15, 2};
        System.out.println(countOdd(nums));
    }

    public static int countOdd(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (num % 2 != 0){
                count++;
            }
        }
        return count;
    }
}
