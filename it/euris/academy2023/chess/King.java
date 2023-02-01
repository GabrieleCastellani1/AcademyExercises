package it.euris.academy2023.chess;

public class King extends Piece{
    @Override
    public boolean validate(int x, int y) {
        return Math.abs(this.x-x) == 1 && this.y == y
                || Math.abs(this.y-y) == 1 && this.x == x
                || ((Math.abs(this.x-x) == Math.abs(this.y-y)) && Math.abs(this.x-x) == 1);
    }

    public King(){
        super();
    }
    public King(int x, int y){
        super(x,y);
    }
}
