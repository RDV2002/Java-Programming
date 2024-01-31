package Loops1;

import java.util.Scanner;

public class L1_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,fact = 1;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        while(number != 0) {
            fact = fact * number;
            number--;
        }
        System.out.println("The factprial of the number is " + fact);
        sc.close();
    }
}
