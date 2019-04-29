//© A+ Computer Science
//www.apluscompsci.com

//linked list worksheet 3 key

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class LinkedListWorkSheet3KEY
{
   public static void print(ListNode list)
   {
   	while(list!=null)
   	{
   		out.print(list.getValue()+" ");
   		list=list.getNext();
   	}
   }
   
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
	   while(list!=null&&list.getNext()!=null)
   	{
   		list.setNext(list.getNext().getNext());
   		list=list.getNext();
   	}	
	}

	//method doubleUp will double the size of the list by adding in 
	//new nodes with the same values as the original list nodes
	public static void doubleUp(ListNode list)
	{
	   while(list!=null)
   	{
   	   ListNode add = new ListNode(list.getValue(), list.getNext());
   		list.setNext(add);
   		list=add.getNext();
   	}		
	}
 

	public static void main(String[] args)
	{
		ListNode a = new ListNode("7",
				     		new ListNode("11",null));
		
		ListNode x = new ListNode("6",
				     		new ListNode("2",
				     		new ListNode("8",null)));
		
   	ListNode y = new ListNode("go",
				     		new ListNode("on",
							new ListNode("at",
				     		new ListNode("over",null))));
		
		ListNode z = new ListNode("go",
			 			new ListNode("on",
		      		new ListNode("at",
		       		new ListNode("up",
			 			new ListNode("over",null)))));
			 			
		out.println("quest 1\n\n");	
		
		print(z);
		out.println();
		
		skipEveryOther(z);

		print(z);
		out.println();			 			


		out.println("quest 2\n\n");	
		
		print(y);
		out.println();
		
		doubleUp(y);

		print(y);
		out.println();			 	
	
	}
}