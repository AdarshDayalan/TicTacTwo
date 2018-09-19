package game;

import java.awt.Color;

import javax.swing.JFrame;

import board.BoardManager;
import board.Square;
import graphics.GameCanvas;
import graphics.GameGraphics;
import listener.SquareListener;

public class Game {
	
	private static BoardManager boardManager;
	public static JFrame window;
	
	
	public static void main(String[] args) {
		boardManager = new BoardManager();
		
		//boardManager.generateRandomBoard();
		
		detectWinner();
		
		window = new JFrame();
		window.add(boardManager.getGraphics());
		window.setVisible(true);
		window.setSize(500, 500);
		window.addMouseListener(new SquareListener());
	}
	
	public static BoardManager getBoardManager() {
		return boardManager;
	}
	public static void detectWinner() {
			Square[][] squares = boardManager.getBoard().getSquares();
			squares[0][0].getSquareState();
			boolean gameWinner = false;

	for (int i = 0; i < squares.length; i++) {
		if (squares[i][i].getSquareState().equals("X")) {		
			if (squares[i][0].getSquareState().equals 
									(squares[i][1].getSquareState())
									&& squares[i][1].getSquareState().equals 
									(squares[i][2].getSquareState())) {
								System.out.println( squares[i][0].getSquareState() + " has won");
								System.exit(0);
					
				}
				
				if(squares[0][i].getSquareState().equals 
						(squares[1][i].getSquareState())
						&& squares[1][i].getSquareState().equals 
						(squares[2][i].getSquareState())) {
					System.out.println( squares[0][i].getSquareState() + " has won");
					System.exit(0);
					}
				}
		if (squares[i][i].getSquareState().equals("O")) {		
			if (squares[i][0].getSquareState().equals 
									(squares[i][1].getSquareState())
									&& squares[i][1].getSquareState().equals 
									(squares[i][2].getSquareState())) {
								System.out.println( squares[i][0].getSquareState() + " has won");
								System.exit(0);
					
				}
				
				if(squares[0][i].getSquareState().equals 
						(squares[1][i].getSquareState())
						&& squares[1][i].getSquareState().equals 
						(squares[2][i].getSquareState())) {
					System.out.println( squares[0][i].getSquareState() + " has won");
					System.exit(0);
					}
				}
			} 
		}

}
	
			

	
