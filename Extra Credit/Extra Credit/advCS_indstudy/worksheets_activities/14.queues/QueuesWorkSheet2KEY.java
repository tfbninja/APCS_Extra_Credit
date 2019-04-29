//© A+ Computer Science
//www.apluscompsci.com

//queues worksheet 2 key

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class QueuesWorkSheet2KEY
{
	public static void main(String[] args)
	{
		out.println("quest 1\n\n");
		Queue<Integer> a = new PriorityQueue<Integer>();
		a.add(45);
		a.add(76);
		a.add(34);
		out.println(a);
		out.println(a.remove());
		
		out.println("\n\nquest 2\n\n");		
		
		
		Queue<Integer> b = new PriorityQueue<Integer>();
		b.add(45);
		b.remove();
		b.add(34);
		out.println(b);
		out.println(b.remove());
		
		
		out.println("\n\nquest 3\n\n");			
		
		Queue<Integer> c = new PriorityQueue<Integer>();
		c.add(45);
		out.println(c.peek());
		c.add(34);
		out.println(c.remove());
		c.add(67);
		out.println(c);
		
		
		out.println("\n\nquest 4\n\n");		
		
		
		Queue<Double> d = new PriorityQueue<Double>();
		d.add(9.2);
		d.add(1.1);
		d.add(7.3);
		d.add(5.6);
		out.println(d.remove());

		
		
		out.println("\n\nquest 5\n\n");		
		
		Queue<String> e = new PriorityQueue<String>();
		e.add("ab");
		e.add("78");
		e.add("ET");
		out.println(e.remove());
		e.add("one");
		out.println(e.remove());
		out.println(e.size());
		out.println(e.remove());
		
		
		out.println("\n\nquest 6\n\n");		
		Queue<String> f = new PriorityQueue<String>();
		f.add("it");
		f.add("go");
		f.add("we");
		f.add("by");
		while(!f.isEmpty()) {
		   System.out.println(f.remove());
		}
		
		
	}
}