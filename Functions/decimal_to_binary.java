package Functions;

import java.util.*;

public class decimal_to_binary {
    public static int decimalToBinary(int decimal_number) {
        int pow = 0, rem,binary_number = 0 ;
        while(decimal_number > 0) {
            rem = decimal_number % 2;
            binary_number = binary_number + (rem * (int) Math.pow(10,pow));
            pow++;
            decimal_number = decimal_number/2;
        }
        return binary_number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int decimal_number = sc.nextInt();
        System.out.println("The Decimal equivalent of the binary number is " + decimalToBinary(decimal_number));
        sc.close();
    }
}
