// Optimal Solution => O(n)

package Arrays;

public class TrappedRainwater {
    public static int trappedRainwater(int[] height) {
        int n = height.length;
        int width = 1;
        // Calculate Left Max Values
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Calculate Right Max Values
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int waterlevel, trappedWater = 0;
        // Calculate waterlevel = (min(left,right) - height) * width
        for (int i = 0; i < n; i++) {
            waterlevel = ((Math.min(leftMax[i], rightMax[i]) - height[i]) * width);
            trappedWater += waterlevel;
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("The Trapped Water => " + trappedRainwater(height));
    }
}
