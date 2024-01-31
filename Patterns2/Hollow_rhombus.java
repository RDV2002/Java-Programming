//     *****
//    *   *
//   *   *
//  *   *
// *****

package Patterns2;

public class Hollow_rhombus {
    public static void rhombus(int n) {
        //Outer Loop --> th enumber of lines
        for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //Hollow Rectangle -- stars
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else    
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rhombus(5);
    }
}
