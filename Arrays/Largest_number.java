package Arrays;

public class Largest_number {
    public static int largest(int[] numbers) {
        // We can allot as int largest = Integer.MIN_VALUE; --> This implies - infinity
        // value
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (largest < numbers[i])
                largest = numbers[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 5, 4 };
        int largest_number = largest(numbers);
        System.out.println("The largest number the array is " + largest_number);
    }
}
