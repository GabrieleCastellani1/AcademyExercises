package it.euris.academy2023.chess;

import java.util.LinkedHashMap;
import java.util.Map;

public class Chessboard {

    Map<Piece, Behavior> pieces;

    public void add(Piece p, Behavior b){
        this.pieces.put(p, b);
    }

    public Chessboard(){
        this.pieces = new LinkedHashMap<>();
    }

    public Chessboard(Map<Piece, Behavior> pieces){
        this.pieces = pieces;
    }

    public void startGame(){
        for (Piece p : pieces.keySet()){
            System.out.println(pieces.get(p).simulate(p));
        }
    }
}
