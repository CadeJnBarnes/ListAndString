package useful.view;

import javax.swing.JOptionPane;

public class PopupDisplay
{
	// This method is a popup that makes you respond before going away.
	//Displays the supplied message in a popup method
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	public String getResponse(String fromQuestion)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, fromQuestion);
		
		return response;
	}
}
