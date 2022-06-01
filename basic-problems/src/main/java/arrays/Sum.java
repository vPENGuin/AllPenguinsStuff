package arrays;

public class Sum {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 6, 2, 6, 2};
        System.out.println(sum(nums));
    }

    public static int sum(int[] nums){
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        return sum;
    }
}
