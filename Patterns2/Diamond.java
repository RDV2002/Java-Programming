package Patterns2;

public class Diamond {
    public static void pattern(int n) {
        // 1st Half
        for(int i = 1; i <= n; i++) {
            //Spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //Stars
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 2nd Half --> Mirror Image of 1st Half
        for(int i = n; i >= 1; i--) {
            //Spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //Stars
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
