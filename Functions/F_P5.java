package Functions;

import java.util.Scanner;

public class F_P5 {
    public static void sumOfDigits(int number) {
        int a, sum_of_digits = 0;
        while(number != 0) {
            a = number % 10;
            sum_of_digits = sum_of_digits + a;
            number = number/10;
        }
        System.out.println("The sum of the digits of the number is " + sum_of_digits);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        sumOfDigits(number);
        sc.close();
    }
}
