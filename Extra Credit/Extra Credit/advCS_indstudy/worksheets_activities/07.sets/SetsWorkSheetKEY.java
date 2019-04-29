//© A+ Computer Science
//www.apluscompsci.com

//sets worksheet key

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class SetsWorkSheetKEY
{
	public static void main(String[] args)
	{
		//Collection c = new Collection();		//illegal
		
		//Collection c = new List();					//illegal
		
		Collection c = new ArrayList();
		
		//List x = new Set();							//illegal
		
		//List x = new TreeSet();					//illegal
		
		Collection x = new TreeSet();

		Set<Integer> s = new TreeSet<Integer>();
		s.add(5);
		s.add(6);
		s.add(6);
		s.add(7);
		out.println(s);
		
		out.println("\n\n");
		
		Set<Integer> a = new TreeSet<Integer>();
		a.add(9);
		out.println(a.add(6));
		out.println(a.add(6));
		a.add(1);
		out.println(a);
		
		out.println("\n\n");		
		
		Set<String> b = new TreeSet<String>();
		b.add("a");
		b.add("6");
		b.add("A");
		b.add("d");
		out.println(b);
	}
}