import java.util.*;
public class P1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 >= num2){
            System.out.println("The largest number is " + num1);
        }
        else{
            System.out.println("The largest number is " + num2);
        }
        sc.close();
    }
}