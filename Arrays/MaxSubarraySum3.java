// Kadane's Algorithm ==> Best Method
// Time Complexity => O(n)
package Arrays;

public class MaxSubarraySum3 {
    public static void printsubarrays(int numbers[]) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            curSum = (curSum + numbers[i]) > 0 ? curSum + numbers[i] : 0;
            if (maxSum < curSum)
                maxSum = curSum;
        }

        System.out.println("The Maximum Subarray Sum => " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        printsubarrays(numbers);
    }
}
