// Not the best solution => O(n^2)

package Arrays;

public class TrappedRainwaterProblem {
    public static int[] leftMaxValues(int[] height) {
        int leftMax[] = new int[7];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                if (leftMax[j] <= height[i])
                    leftMax[i] = height[i];
                else
                    leftMax[i] = leftMax[i - 1];
            }
        }
        return leftMax;
    }

    public static int[] rightMaxValues(int[] height) {
        int rightMax[] = new int[7];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            for (int j = i; j < height.length; j++) {
                if (rightMax[j] <= height[i])
                    rightMax[i] = height[i];
                else
                    rightMax[i] = rightMax[i + 1];
            }
        }
        return rightMax;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int leftMax[] = new int[7];
        int rightMax[] = new int[7];
        int totalWaterTrapped = 0, temp, width = 1;
        leftMax = leftMaxValues(height);
        rightMax = rightMaxValues(height);
        System.out.println("Left Max Array: ");
        for (int i = 0; i < leftMax.length; i++)
            System.out.print(leftMax[i] + "  ");
        System.out.println();
        System.out.println("Right Max Array: ");
        for (int i = 0; i < rightMax.length; i++)
            System.out.print(rightMax[i] + "  ");
        System.out.println();

        // Trapped RainWater
        for (int i = 0; i < height.length; i++) {
            temp = (Math.min(leftMax[i], rightMax[i]) - height[i]) * width;
            totalWaterTrapped = totalWaterTrapped + temp;
        }
        System.out.println("Total Trapped Water => " + totalWaterTrapped);
    }
}
