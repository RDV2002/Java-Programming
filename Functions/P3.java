// Find the Binomial Coefficient --> nCr = n!/r!*(n-r)!
package Functions;

import java.util.Scanner;

public class P3 {
    public static int factorial(int number) {
        int fact = 1;
        while(number != 0) {
            fact = fact * number;
            number--;
        }
        return fact;
    }
    public static float binomial_coefficient(int n1, int r1) {
        int n = factorial(n1);
        int r = factorial(r1);
        int p = factorial(n1 - r1);
        float bc = n/(r*p);
        return bc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        float result = binomial_coefficient(n, r);
        System.out.println("The Binomial Coefficient =  " + result);
        sc.close();
    }
}
