//Star Pattern

// package Pattens1;

public class P1 {
    public static void main(String[] args) {
        //Outer loop -> Lines
        for(int line = 1; line <= 4; line ++) {
            //Inner loop -> Number of times
            for(int star = 1; star <= line; star ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
