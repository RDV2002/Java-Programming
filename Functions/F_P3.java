/*Write a Java program to check if a number is a palindrome in Java?
(121 is a palindrome, 321 is not) */

package Functions;

import java.util.Scanner;

public class F_P3 {
    public static void palindrome(int number) {
        int duplicate = number;
        int reverse = 0, a;
        while(duplicate != 0) {
            a = duplicate % 10;
            reverse = reverse * 10 + a;
            duplicate = duplicate/10;
        }
        if(number == reverse)
            System.out.println("It is a palindrome number");
        else
            System.out.println("It is not a palindrome number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        palindrome(number);
        sc.close();
    }
}
