package entities;

import entities.enums.Color;

public class Bishop extends ChessPiece {
    
    public Bishop(){
        super();
    }

    public Bishop(Color color, Position position){
        super(color, position);
    }
}
