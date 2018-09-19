package board;

public class Board {
	
	/* The squares on the board are stored in a 2-D array
	 * EX.
	 * 
	 *          |         |
	 *          |         |
	 *  [0][0]  |  [0][1] | [0][2]
	 *          |         |     
	 * _________|_________|_________
	 *          |         |     
	 *          |         |
	 *  [1][0]  |  [1][1] | [1][2]
	 *          |         |
	 * _________|_________|_________
	 *          |         |    
	 *          |         |
	 *  [2][0]  |  [2][1] | [2][2]
	 *          |         |
	 *          |         |
	 */
	
	//Constant square size in pixels
	private static final int SQUARE_SIZE = 100;
	private static final int SQUARE_GAP = 10; 
	
	private Square[][] m_squares;
	
	private int m_bottomValue;
	
	//Board constructor
	public Board(int p_boardSize) {
		createSquares(p_boardSize, p_boardSize, SQUARE_SIZE);
	}
	
	/**
	 * Method creates all the square objects on the board. Sets the position of each square
	 * and places them into an array of Squares.
	 * 
	 * @param p_rowCount Amount of rows on the board
	 * @param p_colCount Amount of columns on the board
	 * @param p_squareSize Size of each square in pixels
	 */
	private void createSquares(int p_rowCount, int p_colCount, int p_squareSize) {
		//Initialize the square array to be the size of the board
		m_squares = new Square[p_rowCount][p_colCount];
		
		//Loop through each row, i
		for(int i = 0; i < p_rowCount; i++) {
			//Go through all the columns, j, in a given row, i
			for(int j = 0; j < p_colCount; j++) {
				m_squares[i][j] = new Square(SQUARE_GAP + (SQUARE_SIZE + SQUARE_GAP) * j, SQUARE_GAP + (SQUARE_SIZE + SQUARE_GAP) * i, SQUARE_SIZE, SQUARE_SIZE);
				m_squares[i][j].setValueEmpty();
				
				if(m_bottomValue <= m_squares[i][j].getX() + m_squares[i][j].getWidth()) {
					m_bottomValue = m_squares[i][j].getX() + m_squares[i][j].getWidth();
				}
			}
		}
	}
	
	public int getBottomValue() {
		return m_bottomValue;
	}
	
	public Square[][] getSquares(){
		return m_squares;
	}
	
}
