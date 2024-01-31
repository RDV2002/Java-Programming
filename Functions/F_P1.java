//Write a Java method to compute the averageof three numbers.

package Functions;

import java.util.Scanner;

public class F_P1 {
    public static float average(int num1, int num2, int num3) {
        float avg = (num1 + num2 + num3)/3;
        return avg; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("The average of three numbers = " + average(num1,num2,num3));
        sc.close();
    }
}
