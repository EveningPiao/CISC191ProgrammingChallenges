package edu.sdmesa.cisc191;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/**
 * Lead Author(s): TianLin Zhao
 *  
 * Version/date: 5/5/2026
 * 
 * Responsibilities of class:
 * Builds the Gone Fishing window. IS-A JFrame.
 * Holds the instructions on the WEST, the 6x6 fishing button grid in the
 * CENTER, the two sliders (Tries / Fish remaining) on the EAST, and the
 * label on the SOUTH.
 * 
 */

public class GoneFishingView extends JFrame
{
	// UID for Serializable.
	private static final long serialVersionUID = 1L;
 
	private GoneFishingModel model;
 
	// Sliders are instance variables so updateUI() can refresh them.
	private JSlider triesSlider;
	private JSlider fishSlider;
 
	/**
	 * Construct the Gone Fishing window: title, layout, panels, and widgets.
	 * @param model the game model whose state the view will display
	 */
	public GoneFishingView(GoneFishingModel model)
	{
		this.model = model;
 
		this.setTitle("Gone Fishing");
 
		// Use a BorderLayout for future use
		this.setLayout(new BorderLayout());
 
		// WEST: instructions panel 
		JPanel instructions = new JPanel();
		JLabel instructionLabel = new JLabel("Click on the buttons to fish");
		instructions.add(instructionLabel);
		this.add(instructions, BorderLayout.WEST);
 
		// CENTER: 6x6 fishing button grid 
		JPanel fishingPanel = new JPanel();
		// Use the model's DIMENSION constant so changing the model changes the grid.
		fishingPanel.setLayout(new GridLayout(GoneFishingModel.DIMENSION, GoneFishingModel.DIMENSION));
 
		// Nested loop to create one FishingButton per cell in the grid.
		for (int row = 0; row < GoneFishingModel.DIMENSION; row++)
		{
			for (int col = 0; col < GoneFishingModel.DIMENSION; col++)
			{
				// Create the button and remember its grid position.
				FishingButton fish = new FishingButton(row, col);
 
				// Give the button a minimum size
				fish.setPreferredSize(new Dimension(60, 60));
 
				// Connect the listener: when the user clicks this button,
				// the listener will look up its row/col in the model.
				fish.addActionListener(new FishingButtonListener(this.model, this, fish));
 
				// Add the button to the fishing panel (not directly to the JFrame).
				fishingPanel.add(fish);
			}
		}
		this.add(fishingPanel, BorderLayout.CENTER);
 
		// EAST: two vertical sliders for Tries and Fish remaining 
		JPanel sliderPanel = new JPanel();
		// 1 row, 2 columns: one column per (slider + label) pair.
		sliderPanel.setLayout(new GridLayout(1, 2));
 
		triesSlider = new JSlider(SwingConstants.VERTICAL, 0, 30, model.getTriesRemaining());
		triesSlider.setMajorTickSpacing(10);
		triesSlider.setPaintTicks(true);
		triesSlider.setPaintLabels(true);
		triesSlider.setEnabled(false);
		triesSlider.setBorder(javax.swing.BorderFactory.createTitledBorder("Tries"));
 
		fishSlider = new JSlider(SwingConstants.VERTICAL, 0, 10, model.getFishRemaining());
		fishSlider.setMajorTickSpacing(5);
		fishSlider.setPaintTicks(true);
		fishSlider.setPaintLabels(true);
		fishSlider.setEnabled(false);
		fishSlider.setBorder(javax.swing.BorderFactory.createTitledBorder("Fish"));
 
		sliderPanel.add(triesSlider);
		sliderPanel.add(fishSlider);
		this.add(sliderPanel, BorderLayout.EAST);
 
		// SOUTH: "Programmed by" label 
		JPanel bottomPanel = new JPanel();
		JLabel programmerLabel = new JLabel("Programmed by: J. Random Hacker & Bugs Galore");
		bottomPanel.add(programmerLabel);
		this.add(bottomPanel, BorderLayout.SOUTH);
 
		// Standard JFrame setup.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
 
	/**
	 * Starts the game.
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		new GoneFishingView(new GoneFishingModel());
	}
 
	/**
	 * Refresh anything in the view that depends on the model's state.
	 * Currently it's the two sliders, which need to follow
	 * triesRemaining and fishRemaining as the player clicks buttons.
	 */
	public void updateUI()
	{
		// triesSlider/fishSlider are guaranteed non-null after the
		// constructor finishes, but checking is a cheap safety net.
		if (triesSlider != null)
		{
			triesSlider.setValue(model.getTriesRemaining());
		}
		if (fishSlider != null)
		{
			fishSlider.setValue(model.getFishRemaining());
		}
	}
}
