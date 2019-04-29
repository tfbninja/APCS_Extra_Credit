//© A+ Computer Science  -  www.apluscompsci.com

//ArrayList worksheet 2 key  

import static java.lang.System.*;
import java.util.ArrayList;

class Grade
{
   private double grade;
   
   public Grade(double g)
   {
      grade=g;
   }

   public char getLetter()
   {
      if(grade>=90)  return 'A';
      else if(grade>=80) return 'B';
      else if(grade>=75) return 'C';
      else if(grade>=70) return 'D';
      return 'F';
   }
   
   public String toString()
   {
      return ""+String.format("%.2f",grade);
   }
}

public class ArrayListWorkSheet2KEY
{
	public static void main(String[] args)
	{
		ArrayList<Grade> grades = new ArrayList<Grade>();
		
		for(int spot=0; spot<8; spot++)
		{
		   grades.add(new Grade(Math.random()*100));
		}		
		
		for(int spot=0; spot<grades.size(); spot++)
		{
		   out.println(grades.get(spot));
		}		
		
		for(int spot=0; spot<grades.size(); spot++)
		{
		   out.println(grades.get(spot).getLetter());
		}
	}
}