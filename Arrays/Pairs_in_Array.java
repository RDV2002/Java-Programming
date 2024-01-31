// To form Pairs using the elements of the Array
// eg: numbers[] = {2,4,6,8,10};
// Pairs: 
// (2,4)(2,6)(2,8)(2,10)
// (4,6)(4,8)(4,10)
// (6,8)(6,10)
// (8,10)
package Arrays;

public class Pairs_in_Array {
    public static void pairs(int numbers[]) {
        System.out.println("Pairs: ");
        int k = 0;
        while (k < numbers.length) {
            for (int i = k + 1; i < numbers.length; i++) {
                System.out.print("(" + numbers[k] + "," + numbers[i] + ")");
            }
            k++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairs(numbers);
    }
}
