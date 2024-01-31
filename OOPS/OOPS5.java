
// Polymorphism

public class OOPS5 {
    public static void main(String[] args) {
        Deer dr = new Deer();
        dr.eats();

        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum((float) 1.5, (float) 2.5));
        // System.out.println(calc.sum(1, 2, 3));
    }
}


// Method Overriding
class Animal {
    void eats() {
        System.out.println("Eats anything");
    }
}

class Deer extends Animal {
    void eats() {
        System.out.println("Eats grass");
    }
}

// Method Overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
