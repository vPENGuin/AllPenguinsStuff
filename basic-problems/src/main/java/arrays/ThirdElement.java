package arrays;
// 1) вывести каждый третий элементы массива. Вход: массив от 0 до n элементов
public class ThirdElement {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 3, 8, 15, 2, 1, 1, 2, 3, 0, 0, 9, 56, 8769, 54678};
        for (int i = 2; i < nums.length; i = i + 3) {
            System.out.println(nums[i]);
        }
    }
}
