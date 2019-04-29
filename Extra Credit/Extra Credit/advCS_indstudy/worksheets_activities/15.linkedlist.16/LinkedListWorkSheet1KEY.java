//© A+ Computer Science
//www.apluscompsci.com

//linked list worksheet 1 key

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class LinkedListWorkSheet1KEY
{
	public static void main(String[] args)
	{
		out.println("quest 1\n\n");
		ListNode x = new ListNode("6",
				     		new ListNode("2",
				     		new ListNode("8",null)));
		
		out.println(x.getValue());
		out.println(x.getNext().getNext().getValue());
		out.println(x.getNext().getValue());

		
		out.println("\n\nquest 2\n\n");		
		
		
		ListNode y = new ListNode("go",
				     		new ListNode("on",
							new ListNode("at",
				     		new ListNode("over",null))));
		
		
		out.println(y.getValue());
		out.println(y.getNext().getNext().getNext().getValue());
		out.println(y.getNext().getValue());
		out.println(y.getNext().getNext().getValue());

		
		
		out.println("\n\nquest 3\n\n");			
		
		ListNode z = new ListNode("go",
			 			new ListNode("on",
		      		new ListNode("at",
		       		new ListNode("up",
			 			new ListNode("over",null)))));
		
		while( z!=null )
		{
		     out.println(z.getValue());
		
		     z=z.getNext();
		}		
	}
}