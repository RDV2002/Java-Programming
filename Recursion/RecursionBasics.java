public class RecursionBasics {

    // Display the numbers in decreasing order
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // Display the numbers in increasing order
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // Find the factorial of a number
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    // Calculate the sum of n natural numbers
    public static int calcSum(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = n + calcSum(n - 1);
        return sum;
    }

    // Find the nth Fibonacci Number
    public static int fibonacci(int n) {
        // O(2^n)
        if (n == 0 || n == 1) {
            return n;
        }

        int fbnm1 = fibonacci(n - 1);
        int fbnm2 = fibonacci(n - 2);
        int fbn = fbnm1 + fbnm2;
        return fbn;
    }

    // Check if the array is sorted or not
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    // WAP to find the first occurance of an element in the array
    public static int firstOccurance(int[] arr, int i, int key) {
        if (i == arr.length) {
            return -1;
        }

        if (key == arr[i]) {
            return i;
        }
        return firstOccurance(arr, i + 1, key);
    }

    // WAP to find the last occurance of an element in the array
    public static int lastOccurance(int[] arr, int i, int key) {
        if (i < 0) {
            return -1;
        }

        if (key == arr[i]) {
            return i;
        }
        return lastOccurance(arr, i - 1, key);
    }

    // Print x^n => O(n)
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xn = x * power(x, n - 1);
        return xn;
    }

    // Print x^n (Optimized Method) => O(log n)
    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        // Case: n is even
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // Case: n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int n = 5, x = 2;

        System.out.println(optimizedPower(x, n));
    }
}