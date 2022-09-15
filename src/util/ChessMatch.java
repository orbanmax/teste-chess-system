package util;

import entities.ChessBoard;

public class ChessMatch {
    private ChessBoard board;
    private int turn;
    private String playerBlack;
    private String playerWhite;

    public ChessMatch(){}

    public ChessMatch(String playerBlack, String playerWhite) {
        this.board = new ChessBoard();
        this.playerBlack = playerBlack;
        this.playerWhite = playerWhite;
    }

    public String getPlayerBlack() {
        return playerBlack;
    }

    public String getPlayerWhite() {
        return playerWhite;
    }
}
