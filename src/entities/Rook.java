package entities;

import java.util.ArrayList;

import entities.enums.Color;

public class Rook extends Piece {

    public Rook(){
        super();
    }

    public Rook(Color color){
        this.color = color;
        this.type = 'R';
        this.possibleMoves = new ArrayList<>();
    }

    @Override
    public void updatePossibleMoves(ChessBoard board){
        possibleMoves.add(new Position(0, 0));
        possibleMoves.add(new Position(0, 1));
        possibleMoves.add(new Position(0, 2));
    }
}
