import java.util.Arrays;

public class ArrayTasks {
    public static String[] seasonsArray() {
        String[] seasons = {"winter", "spring", "summer", "fall"};
        return seasons;
    }

    public static int[] generateNumbers(int length) {
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    public static int totalSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }

        return reversed;
    }

    public static void main(String[] args) {

        String[] seasons = seasonsArray();
        System.out.println(Arrays.toString(seasons));

        int[] numbers = generateNumbers(5);
        System.out.println(Arrays.toString(numbers));

        int[] arr = {1, 2, 3, 4, 5};
        int sum = totalSum(arr);
        System.out.println(sum);

        int[] arr2 = {1, 2, 3, 4, 5};
        int index = findIndexOfNumber(arr2, 3);
        System.out.println(index);

        String[] arr3 = {"apple", "banana", "cherry"};
        String[] reversedArr = reverseArray(arr3);
        System.out.println(Arrays.toString(reversedArr));
    }

}
