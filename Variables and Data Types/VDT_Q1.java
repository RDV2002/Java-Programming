import java.util.*;
public class VDT_Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        float avg;
        avg  = (num1 + num2 + num3)/3; 
        System.out.println("The average of three numbers: " + avg);
        sc.close();
    }
}