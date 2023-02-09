package it.euris.academy2023.EserciziNiccolò.chess;

public class Rook extends Piece{
    @Override
    public boolean validate(int x, int y) {
        return !(this.x != x && this.y != y);
    }

    public Rook(){
        super();
    }
    public Rook(int x, int y){
        super(x,y);
    }
}
