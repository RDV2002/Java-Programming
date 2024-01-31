package Functions;

public class P2 {
    public static int factorial(int number) {
        int i = 1,fact = 1;
        while(i <= number) {
            fact = fact * i;
            i++;
        }
        // System.out.println("Factorial of the number is " + fact);
        return fact;
    }
    public static void main(String[] args) {
        int number = 5,fact;
        fact = factorial(number);
        System.out.println("Factorial of the number is " + fact);
    }
}
