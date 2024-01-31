/* This method gives a minimum time and space complexicity 
   as we do not use a separate array to make the reversing
   Time Complexity = O(n)
   Space Complexity = 1
*/

package Arrays;

public class Reverse_Array {
    public static void reverse(int numbers[]) {
        int temp;
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
}
