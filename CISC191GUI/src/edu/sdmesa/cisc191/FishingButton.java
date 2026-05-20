package edu.sdmesa.cisc191;
 
import javax.swing.JButton;
 
/**
 * Lead Author(s): TianLin Zhao 
 *  
 * Version/date: 5/5/2026
 * 
 * Responsibilities of class:
 * Represents a single button in the Gone Fishing grid.
 * IS-A JButton, and HAS-A row and column position so the listener
 * can ask the model what is at that location.
 */
public class FishingButton extends JButton
{
	// UID for Serializable (JButton implements Serializable).
	private static final long serialVersionUID = 1L;
 
	// The row position of this button in the grid.
	private int row;
	// The column position of this button in the grid.
	private int column;
 
	/**
	 * Construct a FishingButton at the given grid position.
	 * The button starts with a "wave" icon to indicate the cell has not
	 * been fished yet (user story: when the game starts, buttons should
	 * indicate that they have not been fished yet).
	 * @param row    the row index of this button in the grid
	 * @param column the column index of this button in the grid
	 */
	public FishingButton(int row, int column)
	{
		// Call the JButton constructor with the initial "not fished yet" text.
		super("\uD83C\uDF0A");
 
		// Store the row/column so the listener can query the model later.
		this.row = row;
		this.column = column;
	}
 
	/**
	 * @return the row position of this button in the grid
	 */
	public int getRow()
	{
		return row;
	}
 
	/**
	 * @return the column position of this button in the grid
	 */
	public int getColumn()
	{
		return column;
	}
}
