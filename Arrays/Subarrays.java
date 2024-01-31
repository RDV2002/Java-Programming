package Arrays;

public class Subarrays {
    public static void printsubarrays(int numbers[]) {
        System.out.println("Sub-Arrays: ");
        // Initial Element
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            // Remaining Elements
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                // Printing sub-array
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printsubarrays(numbers);
    }
}
