package entities;

import java.util.ArrayList;

import entities.enums.Color;

public class Bishop extends Piece {

    public Bishop(){
        super();
    }

    public Bishop(Color color){
        this.color = color;
        this.type = 'B';
        this.possibleMoves = new ArrayList<>();
    }

    @Override
    public void updatePossibleMoves(ChessBoard board){
        
    }
}

