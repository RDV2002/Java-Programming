package Arrays;

public class Binary_Search {
    public static int search(int numbers[], int key) {
        int start = 0;
        int end = numbers.length;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (numbers[mid] == key) // found number
                return mid;
            else if (numbers[mid] < key) // right side
                start = mid + 1;
            else // left side
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 14;
        int result = search(numbers, key);
        if (result == -1)
            System.out.println("The number is not present in the array!!");
        else
            System.out.println("The number is present in the array at the index " + (result + 1));
    }
}
