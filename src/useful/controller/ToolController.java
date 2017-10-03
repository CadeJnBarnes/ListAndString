package useful.controller;
// Have to make sure to import donut class.
import useful.model.Donut;
import java.util.List;
import java.util.ArrayList;

public class ToolController
{
	private List<Donut> donutList;
	// The parens at the end of each word means that it is calling to something else.
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
	}
}
