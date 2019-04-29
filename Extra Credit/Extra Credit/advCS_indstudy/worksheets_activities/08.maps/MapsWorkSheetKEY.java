//© A+ Computer Science
//www.apluscompsci.com

//maps worksheet key

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class MapsWorkSheetKEY
{
	public static void main(String[] args)
	{
		//Map a = new Map();					//illegal
		
		//Collection b = new Map();			//illegal
		
		//Collection c = new TreeMap();		//illegal
		
		Map d = new HashMap();
		
		SortedMap e = new TreeMap();
		
		Map<Byte,Byte> f = new TreeMap<Byte,Byte>();

		Map<String,Integer> map = new TreeMap<String,Integer>();
		map.put("8",9);
		map.put("8",8);
		map.put("8",7);
		map.put("5",9);
		map.put("6",8);
		map.put("2",12);
		out.println(map);

		out.println("\n\n");

		Map<String,Integer> m = new TreeMap<String,Integer>();
		out.println(m.put("8",1));
		out.println(m.put("8",2));
		m.put("8",3);
		m.put("5",4);
		m.put("6",5);
		m.put("2",6);
		out.println(m);

	}
}