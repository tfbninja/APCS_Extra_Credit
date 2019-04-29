//© A+ Computer Science  -  www.apluscompsci.com

//arraylist worksheet 1 key  

import java.util.ArrayList;
import java.util.Collections;

class Grade{
   private double grade;
   
   public Grade(double g){
      grade=g;
   }

   public String toString(){
      return ""+grade;
   }
}

public class ArrayListWorkSheet1KEY
{
	public static void main(String[] args)
	{
		ArrayList rayList = new ArrayList();
		rayList.add(new Grade(88.7));
		rayList.add(new Grade(100.0));
		rayList.add(new Grade(90.5));
		rayList.add(new Grade(97.1));
		rayList.add(new Grade(57.9));
		
		
		System.out.println(rayList.get(0));		// LINE 1
		
		
		System.out.println(rayList.get(1));		// LINE 2
		
		
		System.out.println(rayList.get(2));		// LINE 3
		
		
		System.out.println(rayList.size());		// LINE 4
		
				
		System.out.println(rayList.remove(0));	// LINE 5
		
		
		System.out.println(rayList.toString());	// LINE 6
		
		
		System.out.println(rayList.remove(1));	// LINE 7
		
		
		System.out.println(rayList.toString());	// LINE 8
	}
}