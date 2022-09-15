package entities;

import java.util.List;
import entities.enums.Color;

public abstract class Piece {
    protected char type;
    protected Color color;
    protected List<Position> possibleMoves;

    public Piece(){}

    public Color getColor() {
        return color;
    }

    public char getType() {
        return type;
    }

    public List<Position> getPossibleMoves(){
        return possibleMoves;
    }

    public abstract void updatePossibleMoves(ChessBoard board);
}
