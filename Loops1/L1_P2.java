package Loops1;

import java.util.Scanner;

public class L1_P2 {
    public static void main(String[] args) {
        int length, i, number, even = 0, odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the numbers: ");
        length = sc.nextInt();
        sc.close();
        System.out.println("Enter the numbers: ");
        for (i = 0; i < length; i++) {
            number = sc.nextInt();
            if (number % 2 == 0)
                even = even + number;
            else
                odd = odd + number;
        }
        System.out.println("Sum of Even Numbers: " + even);
        System.out.println("Sum of Odd Numbers: " + odd);

    }
}
