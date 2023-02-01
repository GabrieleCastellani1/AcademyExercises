package it.euris.academy2023.chess;

import java.util.Objects;

public abstract class Piece {
    protected int x;
    protected int y;

    public final boolean move(int x, int y){
        boolean b = x >= 0 && x <= 7 && y >= 0 && y <= 7 && validate(x,y);
        if(b){
            this.x = x;
            this.y = y;
        }
        return b;
    }

    public abstract boolean validate(int x, int y);
    protected Piece(){}

    protected Piece(int x, int y){
        this.x = x;
        this.y = y;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Piece piece)) return false;
        return x == piece.x && y == piece.y;
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
