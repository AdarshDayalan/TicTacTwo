package board;

import org.w3c.dom.css.Rect;

public class Square {

	//Square state stores the value of the square (X, O, null)
	private String m_squareState;
	
	private int m_x;
	private int m_y;
	private int m_width;
	private int m_height;
	
	//Square constructor
	public Square(int p_x, int p_y, int p_width, int p_height) {
		m_x = p_x;
		m_y = p_y;
		m_width = p_width;
		m_height = p_height;
	}
	
	public void setValueX() {
		m_squareState = "X";
	}
	
	public void setValueO() {
		m_squareState = "O";
	}
	
	public void setValueEmpty() {
		m_squareState = "";
	}
	
	public String getSquareState() {
		return m_squareState;
	}

	public int getX() {
		return m_x;
	}
	
	public int getY() {
		return m_y;
	}
	
	public int getWidth() {
		return m_width;
	}
	
	public int getHeight() {
		return m_height;
	}
}
