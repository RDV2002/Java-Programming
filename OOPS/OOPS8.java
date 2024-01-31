
// Multiple Inheritance using Interfaces

public class OOPS8 {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eats();
    }
}

interface Herbevore {
    void eats();
}

interface Carnivore {
    void eats();
}

class Bear implements Herbevore, Carnivore {
    public void eats() {
        System.out.println("Eats plants as well as animals.");
    }
}
