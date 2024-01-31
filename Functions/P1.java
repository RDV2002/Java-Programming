//Product of two numbers

package Functions;

public class P1 {
    public static int product(int a, int b) {
        int prod;
        prod = a * b;
        return prod;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = product(a,b);
        System.out.println(result);
    }
}