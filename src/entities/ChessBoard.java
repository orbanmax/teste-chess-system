package entities;

import entities.enums.Color;

public class ChessBoard{

    private Piece[][] pieces = new Piece[8][8];

    public ChessBoard(){
        assembleBoard();
    }

    private void assembleBoard(){
        //Black pieces
        pieces[0][0] = new Rook(Color.valueOf("BLACK"));
        pieces[0][1] = new Knight(Color.valueOf("BLACK"));
        pieces[0][2] = new Bishop(Color.valueOf("BLACK"));
        pieces[0][3] = new Queen(Color.valueOf("BLACK"));
        pieces[0][4] = new King(Color.valueOf("BLACK"));
        pieces[0][5] = new Bishop(Color.valueOf("BLACK"));
        pieces[0][6] = new Knight(Color.valueOf("BLACK"));
        pieces[0][7] = new Rook(Color.valueOf("BLACK"));
        pieces[1][0] = new Pawn(Color.valueOf("BLACK"));
        pieces[1][1] = new Pawn(Color.valueOf("BLACK"));
        pieces[1][2] = new Pawn(Color.valueOf("BLACK"));
        pieces[1][3] = new Pawn(Color.valueOf("BLACK"));
        pieces[1][4] = new Pawn(Color.valueOf("BLACK"));
        pieces[1][5] = new Pawn(Color.valueOf("BLACK"));
        pieces[1][6] = new Pawn(Color.valueOf("BLACK"));
        pieces[1][7] = new Pawn(Color.valueOf("BLACK"));
        //White pieces
        pieces[7][0] = new Rook(Color.valueOf("WHITE"));
        pieces[7][1] = new Knight(Color.valueOf("WHITE"));
        pieces[7][2] = new Bishop(Color.valueOf("WHITE"));
        pieces[7][3] = new Queen(Color.valueOf("WHITE"));
        pieces[7][4] = new King(Color.valueOf("WHITE"));
        pieces[7][5] = new Bishop(Color.valueOf("WHITE"));
        pieces[7][6] = new Knight(Color.valueOf("WHITE"));
        pieces[7][7] = new Rook(Color.valueOf("WHITE"));
        pieces[6][0] = new Pawn(Color.valueOf("WHITE"));
        pieces[6][1] = new Pawn(Color.valueOf("WHITE"));
        pieces[6][2] = new Pawn(Color.valueOf("WHITE"));
        pieces[6][3] = new Pawn(Color.valueOf("WHITE"));
        pieces[6][4] = new Pawn(Color.valueOf("WHITE"));
        pieces[6][5] = new Pawn(Color.valueOf("WHITE"));
        pieces[6][6] = new Pawn(Color.valueOf("WHITE"));
        pieces[6][7] = new Pawn(Color.valueOf("WHITE"));
    }

    public Piece[][] getpieces(){
        return pieces;
    }

    public void updatePostions(){

    }

    public String printBoard(){
        StringBuilder sb = new StringBuilder();
        for(int line = 0; line < pieces[0].length; line++){
            for(int colum = 0; colum < pieces.length; colum++){
                if(pieces[line][colum] == null){
                    sb.append("0 ");
                } else{
                    sb.append(pieces[line][colum].getType() + " ");
                }
                if(colum == 7) sb.append("\n");
            }  
        }
        return sb.toString();
    }

    public String selectMove(int x, int y){
        StringBuilder sb = new StringBuilder();

        pieces[x][y].updatePossibleMoves(this);

        for(int line = 0; line < pieces[0].length; line++){
            for(int colum = 0; colum < pieces.length; colum++){
                    
                for(Position p : pieces[line][colum].getPossibleMoves()){
                    if(line == p.getX() && colum == p.getY()){
                        if(pieces[line][colum] == null){
                            sb.append("(0)");
                        }else{
                            sb.append("(" + pieces[line][colum].getType() + ")"); 
                        }
                    }
                }
                     
                        if(pieces[line][colum] == null){
                            sb.append(" 0 ");
                        } else{
                            sb.append(" " + pieces[line][colum].getType() + " ");
                        }
                    
                    
                    if(colum == pieces[0].length - 1) sb.append("\n");
                
            }  
        }
        return sb.toString();
    }
}