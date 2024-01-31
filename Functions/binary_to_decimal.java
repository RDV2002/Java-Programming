//Binary number to decimal number

package Functions;

import java.util.Scanner;

public class binary_to_decimal {
    public static int binaryToDecimal(int binary_number) {
        double decimal_number = 0;
        int a, i = 0;
        while (binary_number != 0) {
            a = binary_number % 10;
            if (a == 1)
                decimal_number = decimal_number + Math.pow(2, i);
            binary_number = binary_number / 10;
            i++;
        }
        return (int)decimal_number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int binary_number = sc.nextInt();
        System.out.println("The Decimal equivalent of the binary number is " + binaryToDecimal(binary_number));
        sc.close();
    }
}
