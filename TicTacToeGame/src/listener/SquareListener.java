package listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import board.BoardManager;
import board.Square;
import game.Game;


public class SquareListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		Square[][] squares = Game.getBoardManager().getBoard().getSquares();
		BoardManager manager = Game.getBoardManager();
		
		int x = e.getX();
		int y = e.getY();
		int playerTurn = manager.getPlayerTurn();
		boolean gameWinner = false;
		
		for(int i = 0; i <  squares.length; i++) {
			for(int j = 0; j < squares.length; j++) {
				if(x > squares[i][j].getX() && x < squares[i][j].getX() + squares[i][j].getWidth() &&
					y > squares[i][j].getY() && y < squares[i][j].getY() + squares[i][j].getHeight() &&
					squares[i][j].getSquareState().equals("")) {
						if(playerTurn == 0) {
							squares[i][j].setValueX();
						}
						else {
							squares[i][j].setValueO();
						}
				}
						manager.nextTurn();
					Game.window.repaint();
					Game.detectWinner();
					//	System.out.println("Clicked Square " + i + " " + j);
				}
			}
		}
	 
		//TODO make the listener

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
