package it.euris.academy2023.chess;

public class Main {
    public static void main(String[] args) {
        Piece p1 = new Rook(5,5);
        System.out.println(p1.move(5, 7)); // true
        System.out.println(p1.move(7, 7)); // true
        System.out.println(p1.move(2, 2)); // false
        System.out.println();

        Piece p2 = new King(1,0);
        System.out.println(p2.move(1, 1)); // true
        System.out.println(p2.move(2, 1)); // true
        System.out.println(p2.move(2,3)); //false
        System.out.println();

        Piece p3 = new Bishop(3,3);
        System.out.println(p3.move(4, 4)); // true
        System.out.println(p3.move(0, 0)); // true
        System.out.println(p3.move(2, 1)); // false
        System.out.println();

        Chessboard b = new Chessboard();
        b.add(new Rook(5, 5), new Behavior() {
            @Override
            public boolean simulate(Piece p) {
                return p.move(5, 7) && p.move(7, 7) && p.move(2, 2);
            }
        });

        b.add(new King(1, 0), new Behavior() {
            @Override
            public boolean simulate(Piece p) {
                return p.move(1, 1) && p.move(2, 1) && p.move(2,3);
            }
        });

        b.add(new Bishop(3, 3), new Behavior() {
            @Override
            public boolean simulate(Piece p) {
                return p.move(4, 4) && p.move(0, 0);
            }
        });

        b.startGame();
    }
}
