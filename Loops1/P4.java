
// Check whether the number is prime number or not

package Loops1;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        int number, i = 1, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        while(i <= Math.sqrt(number)) {
            if(number % i == 0) {
                k++; 
            }
            i++;
        }
        if(k == 2)
            System.out.println("The number is a prime number");
        else 
            System.out.println("The number is not a prime number");
        
        sc.close();
    }
}


// Alternate method
// if(number == 2){
//     System.out.println("It is a prime number");
// }
// else{
//     boolean isPrime = true;
//     for( int i = 2; i <= number -1; i++) {
//         if( number % i == 0) {
//             isPrime =false;
//             break;
//         }
//     }
//     if(isPrime == true)
//         System.out.println("It is a prime number");
//     else
//         System.out.println("It is not a prime number");
// }
