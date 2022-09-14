package entities;

import entities.enums.Color;

public class Pawn extends ChessPiece {
    
    public Pawn() {
        super();
    }

    public Pawn(Color color, Position position){
        super(color, position);
    }
    
}
