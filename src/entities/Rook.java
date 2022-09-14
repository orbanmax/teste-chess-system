package entities;

import entities.enums.Color;

public class Rook extends ChessPiece {

    public Rook() {
        super();
    }

    public Rook(Color color, int x, int y){
        super(color, new Position(x, y));
    }
}
