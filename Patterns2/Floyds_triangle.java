// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 

package Patterns2;

public class Floyds_triangle {
    public static void triangle(int length) {
        int counter = 1;
        //Outer Loop --> Number of Lines
        for(int i = 1; i <= length; i++) {
            //Inner Loop --> How many times the counter will be printed 
            for(int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(5);
    }
}
