package entities;

import java.util.ArrayList;

import entities.enums.Color;

public class Pawn extends Piece {

    public Pawn() {
        super();
    }

    public Pawn(Color color){
        this.color = color;
        this.type = 'P';
        this.possibleMoves = new ArrayList<>();
    }

    @Override
    public void updatePossibleMoves(ChessBoard board){
        
    }
}
