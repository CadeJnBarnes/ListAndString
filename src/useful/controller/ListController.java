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
	
// This is where I link everything to the running part of the program
	public void start()
	{
		//Here we see hoe to find the longest word in a text.
		Donut temp = new Donut();
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("this is a word sequence");
		tempList.add("DonutTests.zip");
		tempList.add("");
		tempList.add("My name is cade");
		tempList.add("DonutTest.zip2");
		
		display.displayText("The longest string in the tempList is: " + maxLength(tempList) + " long");
		display.displayText("It is: " + longestString(tempList));
		
		donutList.add(temp);
		fillTheList();
		showTheList();
		changeTheList();
		practiceWithList();
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
	
	// types that fill the list
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

	//How to add and remove things from the list
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
	
	public int maxLength(ArrayList<String> myList)
	{
		int max = 0;
		
		for(int index = 0;index < myList.size(); index += 1)
		{
			if (max < myList.get(index).length())
			{
				max = myList.get(index).length();
			}
		}
		return max;
	}
	
	public String longestString(ArrayList<String> myList)
	{
		String longest = "";
		int max = 0;
		for(int index = 0; index < myList.size(); index += 1)
		{
			if (myList.get(index).length() > max)
			{
				max = myList.get(index).length();
				longest = myList.get(index);
			}
		}
			
			return longest;
	}
	
	
	// Here is where I practiced my add, remove and get methods
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
//		for (int woop = 0; woop < 5; woop += 1)
//		{
//			display.displayText("Your Donut chosen ");
//		}
		String donutRemove = display.getResponse("What donut do you want to eat?");
		
		
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
