
// Inheritance

public class OOPS4 {
    public static void main(String[] args) {
        Dogs german = new Dogs();
        german.eats();
        german.legs = 4;
        System.out.println(german.legs);
    }
}

// Base Class
class Animal {
    String color;

    void eats() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }

}

// Derived Class
class Mammals extends Animal {
    int legs;
}

class Dogs extends Mammals {
    String breed;
}

// Derived Class/Subclass
// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("swims");
// }
// }
