package useful.controller;
// Have to make sure to import donut class.
import useful.model.Donut;
import java.util.List;
import java.util.ArrayList;
import useful.view.Popup;

public class ToolController
{
	private List<Donut> donutList;
	private Popup display;
	// The parens at the end of each word means that it is calling to something else.
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
		display = new Popup();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		
		for (int index = 0; index < donutList.size(); index += 1)
		{
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
}
