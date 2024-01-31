// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 

package Patterns2;

public class triangle_01 {
    public static void triangle(int length) {
        //Outer Loop --> No. of lines
        for(int i = 1; i <= length; i++) {
            // Inner Loop --> Printing the pattern
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(5);
    }
}
