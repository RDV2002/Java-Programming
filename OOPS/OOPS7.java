
// Interface

public class OOPS7 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface chessPlayer {
    void moves(); // by default it is public and abstract
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("Up, down, right, left and diagoanl (in all 4 directions)");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("Up, down, right, left");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("Up, down, right, left and diagoanl (by 1 step in all directions)");
    }
}
