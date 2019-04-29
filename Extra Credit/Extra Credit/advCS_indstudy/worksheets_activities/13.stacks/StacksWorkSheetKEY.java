//© A+ Computer Science
//www.apluscompsci.com

//stacks worksheet key

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class StacksWorkSheetKEY
{
	public static void main(String[] args)
	{
		out.println("quest 1\n\n");
		Stack<Integer> a = new Stack<Integer>();
		a.push(45);
		a.push(76);
		a.push(34);
		out.println(a);
		out.println(a.pop());
		
		out.println("\n\nquest 2\n\n");
		
		
		Stack<Integer> b = new Stack<Integer>();
		b.push(45);
		b.pop();
		b.push(34);
		out.println(b);
		out.println(b.pop());
		
		out.println("\n\nquest 3\n\n");		
		
		
		Stack<Integer> c = new Stack<Integer>();
		c.push(45);
		out.println(c.peek());
		c.push(34);
		out.println(c.pop());
		c.push(67);
		out.println(c);
		
		
		out.println("\n\nquest 4\n\n");		
		
		Stack<Double> d = new Stack<Double>();
		d.push(3.5);
		d.pop();
		d.push(7.1);
		d.push(5.8);
		out.println(d);
		out.println(d.pop());
		
		
		out.println("\n\nquest 5\n\n");		
		
		Stack<String> e = new Stack<String>();
		e.push("45");
		e.push("ab");
		e.pop();
		e.push("ET");
		out.println(e);
		out.println(e.pop());
		out.println(e.size());
		

		out.println("\n\nquest 6\n\n");	
		
		Stack<String> f = new Stack<String>();
		f.push("we");
		f.push("go");
		f.push("by");
		f.push("us");
		while(!f.isEmpty()){
		   out.println(f.pop());
		}
		
	}
}