package edu.sdmesa.cisc191;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JOptionPane;
 
/**
 * Lead Author(s): Tianlin Zhao
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * Version/date: 5/5/2026
 * 
 * Responsibilities of class:
 * Connects the GUI buttons and the model together when the user
 * clicks a fishing button.
 */
public class FishingButtonListener implements ActionListener
{
	// HAS-A reference to the model so we can ask it whether a fish is at a location.
	private GoneFishingModel goneFishingModel;
	// HAS-A reference to the view so we can refresh the sliders after each click.
	private GoneFishingView goneFishingView;
	// HAS-A reference to the specific button this listener is attached to.
	// We store the button (instead of using getSource() on the event) because
	// the assignment forbids getSource()/instanceof.
	private FishingButton fishingButton;
 
	/**
	 * Build a listener that knows about the model, the view, and the
	 * specific button it has been attached to.
	 * @param goneFishingModel the game model that tracks state
	 * @param goneFishingView  the view that needs to be refreshed after a click
	 * @param fishingButton    the button this listener is attached to
	 */
	public FishingButtonListener(GoneFishingModel goneFishingModel, GoneFishingView goneFishingView,
			FishingButton fishingButton)
	{
		// Store all three references as instance variables for later use.
		this.goneFishingModel = goneFishingModel;
		this.goneFishingView = goneFishingView;
		this.fishingButton = fishingButton;
	}
 
	/**
	 * Called by Swing whenever the attached FishingButton is clicked.
	 * Asks the model whether there is a fish at this button's row/column,
	 * updates the button text to "fish" or "X" accordingly, refreshes
	 * the sliders in the view, and then checks whether the game is over.
	 * @param event the action event (not used because we already have the button)
	 */
	@Override
	public void actionPerformed(ActionEvent event)
	{
		// Ask the model what is at this button's row/column. The model
		// also decrements triesRemaining (and fishRemaining if a fish was found).
		boolean foundFish = goneFishingModel.fishAt(fishingButton.getRow(), fishingButton.getColumn());
 
		// Update the button so the user can see what they caught.
		if (foundFish)
		{
			// "fish" label is required by the tester; the emoji is also fine
			// for users since "fish" appears in the test in the Fish-icon case.
			fishingButton.setText("fish");
		}
		else
		{
			// No fish at this location: mark it as empty.
			fishingButton.setText("X");
		}
 
		// Disable this button so the user cannot click it again (no cheating).
		fishingButton.setEnabled(false);
 
		// Refresh the view (sliders, etc.) so the user can see the new counts.
		goneFishingView.updateUI();
 
		// Check whether the game is over and, if so, show a message and exit.
		if (goneFishingModel.playerWins())
		{
			JOptionPane.showMessageDialog(goneFishingView, "Game Over - You Win!");
			System.exit(0);
		}
		else if (goneFishingModel.fishWin())
		{
			JOptionPane.showMessageDialog(goneFishingView, "Game Over - Fishes Win!");
			System.exit(0);
		}
	}
}