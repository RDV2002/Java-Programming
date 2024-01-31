import java.util.Scanner;

public class P6 {
    public static void main(String args[]){
        System.out.println("1. Addition Operation\n");
        System.out.println("2. Subtraction Operation\n");
        System.out.println("3. Multiplication Operation\n");
        System.out.println("4. Division Operation\n");
        System.out.println("5. Modulus Operation\n");
        System.out.println("Enter which operation number\n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Enter two numbers: \n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(choice){
            case 1: System.out.println("Sum = " + (a + b));
                    break;
            case 2: System.out.println("Difference = " + (a - b));
                    break;
            case 3: System.out.println("Product = " + (a * b));
                    break;
            case 4: System.out.println("Division = " + (a / b));
                    break; 
            case 5: System.out.println("Modulo = " + (a % b));
                    break;
            default: System.out.println("Invalid choice");
                    break;
               
        }
        sc.close();
    }
}
