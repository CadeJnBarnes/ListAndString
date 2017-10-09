package useful.controller;
// Have to make sure to import donut class.
import useful.model.Donut;
import java.util.List;
import java.util.ArrayList;
import useful.view.PopupDisplay;

public class ListController
{
	private List<Donut> donutList;
	private PopupDisplay display;
	// The parens at the end of each word means that it is calling to something else.
	public ListController()
	{
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	

	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		fillTheList();
//		showTheList();
		changeTheList();
	}
	
	private void showTheList()
	{
		String favorite = "Rasberry filled";
		for (int index = 0; index < donutList.size(); index += 1)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			Donut currentDonut = donutList.get(index);
			String flavor = currentDonut.getFlavor();
			
			if (currentFlavor.equals(favorite))
			{
				for (int woop = 0; woop < 5; woop +=1)
				{
					display.displayText("The best flavor ever.");
				}
			}
			for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
			}
			display.displayText(donutList.get(index).toString());
		}
			
		
	}
	
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut mapleFlavor = new Donut("maple flavor");
		Donut plainBar = new Donut("plain bar");
		Donut bearclaw = new Donut("bearclaw");
		Donut krispyKreme = new Donut("Krispy Kreme");
		
		donutList.add(mapleFlavor);
		donutList.add(jellyFilled);
		donutList.add(plainBar);
		donutList.add(bearclaw);
		donutList.add(krispyKreme);		
	}

	
	private void changeTheList()
	{
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + " was removed from the list");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
		
		display.displayText("The list still contains: " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed.");
		
	}
	
	private void practiceWithList()
	{
		Donut removed = donutList.remove(2);
		display.displayText("Let's add another donut!"); 
		String unconverted = display.getResponse("What should it be called?");
		donutList.add(new Donut(unconverted));
		display.displayText("New Donut added!");
		donutList.get(donutList.size()-1);
		donutList.add(removed);
		removed = donutList.set(4, new Donut());
		for (int woop = 0; woop < 5; woop += 1)
		{
			display.displayText("Your Donut chosen");
		}
		
		
	}

	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
	
}
