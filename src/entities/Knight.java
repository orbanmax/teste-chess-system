package entities;

import java.util.ArrayList;

import entities.enums.Color;

public class Knight extends Piece {

    public Knight(){
        super();
    }

    public Knight(Color color){
        this.color = color;
        this.type = 'H';
        this.possibleMoves = new ArrayList<>();
    }

    @Override
    public void updatePossibleMoves(ChessBoard board){
        
    }
}
