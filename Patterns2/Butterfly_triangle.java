// For length = 3
// *    *
// **  **
// ******
// ******
// **  **
// *    *

package Patterns2;

public class Butterfly_triangle {
    public static void triangle(int length) {
        //1st Half
        for(int i = 1; i <= length; i++) {
            //Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //Spaces
            for(int j = 1; j <= 2*(length-i); j++) {
                System.out.print(" ");
            }

            //Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half
        for(int i = length; i >= 1; i--) {
            //Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //Spaces
            for(int j = 1; j <= 2*(length-i); j++) {
                System.out.print(" ");
            }

            //Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(3);
    }
}
