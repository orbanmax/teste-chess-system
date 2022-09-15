package application;

import entities.ChessBoard;


public class Program {
    public static void main(String[] args) throws Exception {
        
        ChessBoard cb = new ChessBoard();

        System.out.println(cb.printBoard());
        
        System.out.println(cb.selectMove(0, 4));
    }
}
