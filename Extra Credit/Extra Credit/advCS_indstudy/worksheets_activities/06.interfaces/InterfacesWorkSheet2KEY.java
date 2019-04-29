//© A+ Computer Science  -  www.apluscompsci.com

//InterfacesWorkSheetKEY    

import static java.lang.System.*;
import java.util.Arrays;

interface Locatable
{
   public int getXPos();
   public int getYPos();
}

class Dot implements Locatable
{
   private int xPos, yPos, size;

   public Dot(){
      xPos=yPos=size;
   }

   public Dot(int x, int y){
      xPos=x;
      yPos=y;
      size=0;
   }

   public Dot(int x, int y, int spd){
      xPos=x;
      yPos=y;
      size=spd;
   }

   public int getXPos(){
      return xPos;
   }

   public int getYPos(){
      return yPos;
   }

   public String toString()
   {
      return "" + xPos + " " + yPos + " " + size;
   }  
}


public class InterfacesWorkSheet2KEY
{
	public static void main(String[] args)
	{

	}
}