//� A+ Computer Science
// www.apluscompsci.com

//Iterator remove example 2

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveTwo
{
   public static void main(String args[])
	{
		ArrayList<String> words;
		words = new ArrayList<String>();
		
		words.add("at");
		words.add("is");
		words.add("of");
		
		Iterator<String> it = words.iterator();
		System.out.println(it.next());
		it.remove();
		it.remove();
	}
}
