
// Classes, Objects, and Access Modifiers

public class OOPS {
    public static void main(String args[]) {
        /*
         * Classes and Objects Example
         * Pen p1 = new Pen(); // created a pen object called p1
         * p1.color = "Blue";
         * System.out.println(p1.color);
         * p1.setTip(5);
         * System.out.println(p1.tip);
         */

        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        /*
         * Access Modifiers Example
         * BankAccount myAcc = new BankAccount();
         * myAcc.username = "ridikeshVernekar";
         * System.out.println(myAcc.username);
         * myAcc.setPassword("12345");
         */
    }
}

/*
 * Access Modifiers Example
 * 
 * class BankAccount {
 * public String username;
 * private String password;
 * 
 * public void setPassword(String pwd) {
 * password = pwd;
 * }
 * }
 */

/*
 * Classes and Objects Example
 * class Pen {
 * String color;
 * int tip;
 * 
 * void setColor(String newColor) {
 * color = newColor;
 * }
 * 
 * void setTip(int newTip) {
 * tip = newTip;
 * }
 * }
 */

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}