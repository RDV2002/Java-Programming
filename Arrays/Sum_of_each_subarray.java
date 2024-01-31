package Arrays;

public class Sum_of_each_subarray {
    public static void printsubarrays(int numbers[]) {
        System.out.println("Sub-Arrays: ");
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        // Initial Element
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            // Remaining Elements
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                // Printing Sub-arrays
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                }
                System.out.print("    --> Sum = " + sum);
                System.out.println();
                if (max < sum)
                    max = sum;
                if (min > sum)
                    min = sum;
            }
            System.out.println();
        }
        System.out.println("The maximum value of the Sub-array = " + max);
        System.out.println("The minimum value of the Sub-array = " + min);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printsubarrays(numbers);
    }
}
