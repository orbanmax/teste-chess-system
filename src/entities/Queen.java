package entities;

import java.util.ArrayList;

import entities.enums.Color;

public class Queen extends Piece{

    public Queen(){
        super();
    }

    public Queen(Color color){
        this.color = color;
        this.type = 'Q';
        this.possibleMoves = new ArrayList<>();
    }

    @Override
    public void updatePossibleMoves(ChessBoard board){
        
    }
}
