import java.util.Arrays;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество чисел: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int multiply = multiply(numbers);
        System.out.println(multiply);

        int sum = sum(numbers);
        System.out.println(sum);

        int max = findMax(numbers);
        System.out.println(max);

        int uneven = countUneven(numbers);
        System.out.println(uneven);
    }

    private static int countUneven(int[] numbers) {
        int uneven = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                uneven++;
            }
        }
        return uneven;
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    private static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    private static int multiply(int[] numbers) {
        int multiply = 1;
        for (int number : numbers) {
            multiply = multiply * number;
        }
        return multiply;
    }
}
