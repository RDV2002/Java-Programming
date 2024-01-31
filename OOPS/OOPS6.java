
// Abstraction

public class OOPS6 {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();

        // We cannot create an intance of an abstract class
        // Animal a = new Animal(); --> Not possible
    }
}

// Abstract Class
abstract class Animal {
    String color;

    // Constructor
    Animal() {
        System.out.println("Animal Constructor called");
    }

    // Non-abstract method
    void eats() {
        System.out.println("Animal eats");
    }

    // Abstract method
    abstract void walks();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walks() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang() {
        System.out.println("Mustang Constructor called");
    }
}

class Chicken extends Animal {
    void walks() {
        System.out.println("Walks on 2 legs");
    }
}
