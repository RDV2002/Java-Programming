public class MergeSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // Left Part
        mergeSort(arr, mid + 1, ei); // Right Part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // idx for 1st Sorted Part
        int j = mid + 1; // idx for 2nd Sorted Part
        int k = 0; // idx for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }

        // for left elements of the 1st Sorted Part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for left elements of the 2nd Sorted Part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy the temp array into the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

}