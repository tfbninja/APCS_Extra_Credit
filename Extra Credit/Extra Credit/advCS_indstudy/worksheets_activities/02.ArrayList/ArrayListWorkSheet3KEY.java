//© A+ Computer Science  -  www.apluscompsci.com

//arraylist worksheet 3 

import static java.lang.System.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListWorkSheet3KEY
{
	//this method will return the number 
	//of times num is present in rayList
	public static int numCount(ArrayList<Integer> rayList, int num)
	{
	   int count=0;
	   for(int spot=0; spot<rayList.size(); spot++)
	   {
	      if(rayList.get(spot).equals(num))
	        count++;
	   }
	   return count;
	}
		
	
	public static void main(String[] args)throws Exception
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(6);
		list.add(5);
		list.add(8);
		list.add(12);
		int count=0;
		for(int spot=0; spot<list.size(); spot++){
		   if(list.get(spot)%2==0)
		      count++;
		}
		out.println(count);
		
		out.println(numCount(list,3));
	}
}