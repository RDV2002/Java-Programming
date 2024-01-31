// Prefix Array Method 
// Time Complexity => O(n^2)
package Arrays;

public class MaxSubarraySum2 {
    public static void printsubarrays(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // Prefix Array
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Initial Element
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            // Remaining Elements
            for (int j = i; j < numbers.length; j++) {
                int curSum = 0;
                int end = j;
                curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
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
