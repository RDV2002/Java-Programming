/*
    Basic Sorting
    1. Bubble Sort      => O(n^2)   
    2. Selection Sort   => O(n^2)
    3. Insertion Sort   => O(n^2)
    4. Inbuilt Sort     => O(nlogn)
    5. Counting Sort    => O(nlogn)...In most cases it has O(n) as the time complexity
*/

// import java.util.Arrays;
// import java.util.Collections;

public class BasicSorting {
    public static void bubbleSort(Integer[] arr) {
        int temp;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap++;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (swap == 0) {
                System.out.println("No swapping " + (turn + 1));
                break;
            }
        }
    }

    public static void selectionSort(Integer[] arr) {
        int minPos;
        for (int i = 0; i < arr.length - 1; i++) {
            minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j])
                    minPos = j;
            }
            // swapping
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void insertionSort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // Finding the correct position
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // swapping
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;

        // To find the largest element in the array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // To find the frequency of each element in the array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // To sort the array in the ascending order
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void displayArray(int[] arr) {
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2 };
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr); => OP: 1 2 3 4 5
        // Arrays.sort(arr, 0, 3); => OP: 1 4 5 3 2
        // Arrays.sort(arr, Collections.reverseOrder()); => OP: 5 4 3 2 1
        // Arrays.sort(arr, 0, 3, Collections.reverseOrder()); => OP: 5 4 1 3 2
        countingSort(arr);
        displayArray(arr);
    }
}