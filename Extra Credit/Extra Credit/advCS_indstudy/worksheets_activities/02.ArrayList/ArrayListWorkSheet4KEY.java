//© A+ Computer Science  -  www.apluscompsci.com

//arraylist worksheet 4  

import static java.lang.System.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListWorkSheet4KEY
{
	//this method will return the number 
	//of Strings in rayList with an odd length
	public static int countOddLength(ArrayList rayList)
	{
		int count=0;
		for(int i=0; i<rayList.size(); i++)
		{
			if(((String)rayList.get(i)).length()%2==1)
			   count++;			
		}
		return count;	
	}
		

	//this method will remove all Strings in rayList 
	//that start with same first letter as firstLetter
	public static void removeStrings(ArrayList rayList, char firstLetter)
	{
		int i=0;
		while(i<rayList.size())
		{
			if((((String)rayList.get(i)).charAt(0)==firstLetter))
			   rayList.remove(i);
			else
			  i++;
		}	
	}
	

	
	public static void main(String[] args)throws Exception
	{
		ArrayList list = new ArrayList();
		list.add("fred");
		list.add("at");
		list.add("apple");
		list.add("axe");
		list.add("bird");
		list.add("dog");
		list.add("kitten");
		list.add("alligator");
		list.add("chicken");
		
		
		out.println(countOddLength(list));
		out.println(list);
		removeStrings(list,'a');
		out.println(list);
	}
}