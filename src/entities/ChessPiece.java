package entities;

import entities.enums.Color;

public abstract class ChessPiece {
    private Color color;
    private Position position;

    public ChessPiece(){}

    public ChessPiece(Color color, Position position) {
        this.color = color;
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
