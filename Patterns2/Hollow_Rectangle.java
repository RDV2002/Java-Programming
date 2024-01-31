// *****
// *   *
// *   *
// *****

package Patterns2;
// import java.util.*;
public class Hollow_Rectangle {
    public static void hollow_rectangle_pattern(int rows, int columns) {
        //Outer Loop --> the number of lines 
        for(int i = 1; i <= rows; i++) { 
            //Inner Loop --> display function
            for(int j = 1; j <= columns; j++) {
                if(i == 1 || i == rows || j == 1 || j == columns) 
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the number of rows and columns: ");
        // int rows = sc.nextInt();
        // int columns = sc.nextInt();
        hollow_rectangle_pattern(4, 5);
        // sc.close();
    }
    
}
