package entities;

import java.util.ArrayList;

import entities.enums.Color;

public class King extends Piece {

    public King(){
        super();
    }

    public King(Color color){
        this.color = color;
        this.type = 'K';
        this.possibleMoves = new ArrayList<>();
    }

    @Override
    public void updatePossibleMoves(ChessBoard board){
        
    }
}
