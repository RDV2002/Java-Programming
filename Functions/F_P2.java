/*Write a method named isEven that accepts an int argument.
The method should return true if the argument is even, or false otherwise.
Also write a program to test your method. */

package Functions;

import java.util.Scanner;

public class F_P2 {
    public static boolean isEven(int number) {
        if(number % 2 == 0)
            return true;
        else 
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("The statement the number is even is " + isEven(number));
        sc.close();
    }
}
