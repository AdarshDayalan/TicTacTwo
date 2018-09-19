package board;

import graphics.GameCanvas;

public class BoardManager {

	private static final int BOARD_SIZE = 3;
	private static GameCanvas graphics;
	private int m_playerTurn = 0;
	
	//Board object owned by BoardManager
	private Board m_board;
	
	//Constructor
	public BoardManager() {
		m_board = new Board(BOARD_SIZE);
		graphics = new GameCanvas(this);
	}
	
	public Board getBoard() {
		return m_board;
	}
	
	public void generateRandomBoard() {
		Square[][] squares = m_board.getSquares();
		
		for(int i = 0; i < squares.length; i++) {
			for(int j = 0; j < squares[i].length; j++) {
				Square sq = squares[i][j];
				int squareValue = (int)Math.round(Math.random());
				
				if(squareValue == 0) {
					sq.setValueO();
				} else {
					sq.setValueX();
				}
			}
		}
	}
	
	public GameCanvas getGraphics() {
		return graphics;
	}
	
	public int getPlayerTurn() {
		return m_playerTurn;
	}
	
	public void nextTurn() {
		m_playerTurn ++;
		m_playerTurn %= 2;
	}
}
