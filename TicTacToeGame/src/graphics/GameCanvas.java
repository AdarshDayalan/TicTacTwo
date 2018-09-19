package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

import board.Board;
import board.BoardManager;
import board.Square;
import game.Game;

public class GameCanvas extends JComponent {
	
	private static final Color COLOR_NEUTRAL = Color.WHITE;
	private static final Color COLOR_X = Color.RED;
	private static final Color COLOR_O = Color.BLUE;
	
	private BoardManager m_callingManager;
	
	public GameCanvas(BoardManager p_manager) {
		m_callingManager = p_manager;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = m_callingManager.getBoard().getBottomValue();
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 1620, 800);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, width + 10, width + 10);
		paintSquares(g);
	}
	
	private void paintSquares(Graphics g) {
		Square[][] squares = m_callingManager.getBoard().getSquares();
		for(int i = 0; i < squares.length; i++) {
			for(int j = 0; j < squares[i].length; j++) {
				Square sq = squares[i][j];
				Color sqColor = sq.getSquareState().equals("X") ? COLOR_X : 
					sq.getSquareState().equals("O") ? COLOR_O : COLOR_NEUTRAL;
				g.setColor(sqColor);
				g.fillRect(sq.getX(), sq.getY(), sq.getWidth(), sq.getHeight());
			}
		}
	}
	
}
