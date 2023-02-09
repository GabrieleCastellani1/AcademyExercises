package it.euris.academy2023.EserciziNiccolò.chess;

public class Bishop extends Piece{
    @Override
    public boolean validate(int x, int y) {
        return Math.abs(this.x - x) == Math.abs(this.y-y);
    }

    public Bishop(){
        super();
    }
    public Bishop(int x, int y){
        super(x,y);
    }
}
