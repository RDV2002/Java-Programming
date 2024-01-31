//Part 1: Check whether the entered number is prime or not
//Part 2: Give the prime numbers in the range of the following

package Functions;

import java.util.Scanner;

public class prime_number {
    public static boolean isPrime(int number) {
        int div = 2;
        if(number == 2)
            return true;

        while(div <= Math.sqrt(number)) {
            if(number % div == 0)
                return false;
            div++;
        }
        return true;
    }
    public static void primeInRange(int upper_limit) {
        for(int i = 2;i <= upper_limit; i++) {
            if(isPrime(i))
                System.out.print(i + "\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Part 1
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if(isPrime(number)) 
            System.out.println("The number is a prime number!!");
        else
            System.out.println("The number is not a prime number!!");
        
        //Part 2
        System.out.println("Enter the upper limit of the number till where you want the prime numbers: ");
        int upper_limit = sc.nextInt();
        System.out.println("The Series is as follows: ");
        primeInRange(upper_limit);
        sc.close();
    }
}
