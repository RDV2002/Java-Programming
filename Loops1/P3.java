
// Print reverse of a number

package Loops1;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        int number, rev = 0, a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        while(number != 0) {
            a = number % 10;
            rev = rev * 10 + a;
            number = number / 10;
        }
        System.out.println("Reverse of the number: " + rev);
        sc.close();
    }
}
