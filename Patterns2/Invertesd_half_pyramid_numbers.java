// 12345
// 1234
// 123
// 12
// 1

package Patterns2;

public class Invertesd_half_pyramid_numbers {
    public static void inverted_half_pyramid(int n) {
        //Outer Loop
        for(int i = 1; i <= 5; i++) {
            //Printing Numbers
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid(5);
    }
}
