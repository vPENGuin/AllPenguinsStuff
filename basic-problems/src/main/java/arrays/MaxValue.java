package arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 4, 0, 3};
        System.out.println(max(nums));
    }

    public static int max(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            System.out.println(num);
        }
        return max;
    }
}
