package assignment;

import java.util.TreeSet;
import java.util.stream.Stream;

public class Palette {
	
	TreeSet<String> colors;

	
	public Palette()
	{
		colors = new TreeSet<String>();
	}
	
	public Palette(TreeSet< String > colors)
	{
		this.colors = colors;
	}

	public boolean searchColor(String color) {
		
		/*
		Stream<String> stream = colors.stream();
		
		Stream<String> stream2 = stream.filter((f)-> {if (f.equals(color)) return true; return false;});
		stream2.forEach((ele)->{System.out.println(ele);});
		
		*/
		if(this.colors.contains(color))             //both method works
		 return true;								// to use this method change return type to boolean
		 else
			 return false;
	}

	public void addToPalette (String colors) {
		this.colors.add(colors.toLowerCase());
	}

	public void removeColor(String remove) {

		this.colors.remove(remove);
	}

	public boolean isColorAvailable(String str2) {

		if(this.colors.contains(str2))
		return true;
		else
			return false;
		
	}
	
	
}
