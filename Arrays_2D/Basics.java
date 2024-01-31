package Arrays_2D;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        // int key = 5;
        int lrow = 0, lcolumn = 0;
        int srow = 0, scolumn = 0;
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int n = matrix.length, m = matrix[0].length;
        System.out.println("Please the enter the Matrix data");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                    lrow = i;
                    lcolumn = j;
                }
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                    srow = i;
                    scolumn = j;
                }
            }
        }

        System.out.println("Matrix Data: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The largest element in the Array is " + matrix[lrow][lcolumn] + " at (" + (lrow) + ","
                + (lcolumn) + ").");
        System.out.println("The smallest element in the Array is " + matrix[srow][scolumn] + " at (" + (srow) + ","
                + (scolumn) + ").");
        sc.close();
    }
}
