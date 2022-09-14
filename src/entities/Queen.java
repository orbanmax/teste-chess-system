package entities;

import entities.enums.Color;

public class Queen extends ChessPiece{
    
    public Queen(){
        super();
    }

    public Queen(Color color, int x, int y){
        super(color, new Position(x, y));
    }
}
