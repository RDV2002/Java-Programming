//Income Tax Calculator

import java.util.*;
public class P3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total income in rupees: ");
        int income = sc.nextInt();
        int tax;
        if(income < 500000){
            System.out.println("No tax");
        }
        else if(income >= 500000 && income < 1000000){
            tax = (int) (income * 0.2);  
            System.out.println("Tax payable: Rs." + tax);          
        }
        else{
            tax = (int) (income * 0.3); 
            System.out.println("Tax payable: Rs." + tax);          
        }

        sc.close();
    }
}
