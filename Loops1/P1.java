package Loops1;

import java.util.Scanner;

public class P1 {
    public static void main(String args[]){
        int x = 1,sum = 0;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println();
        while(x <= n){
            sum = sum + x;
            x++;
        }
        System.out.println(sum);
        sc.close();
    }
}
