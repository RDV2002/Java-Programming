// Brute Force Method 
// Time Complexity => O(n^3)
package Arrays;

public class MaxSubarraySum1 {
    public static void printsubarrays(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        // Initial Element
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            // Remaining Elements
            for (int j = i; j < numbers.length; j++) {
                int curSum = 0;
                int end = j;
                // Calculating sub-array value
                for (int k = start; k <= end; k++) {
                    curSum = curSum + numbers[k];
                }
                if (maxSum < curSum)
                    maxSum = curSum;
            }
        }
        System.out.println("The Maximum Subarray Sum => " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        printsubarrays(numbers);
    }
}
