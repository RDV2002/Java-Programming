package Loops1;

import java.util.Scanner;

public class L1_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, i;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        sc.close();
        System.out.println("Multiplication Table: ");
        for (i = 1; i < 10; i++) {
            System.out.println(number + "*" + i + " = " + number * i);
        }
    }
}
