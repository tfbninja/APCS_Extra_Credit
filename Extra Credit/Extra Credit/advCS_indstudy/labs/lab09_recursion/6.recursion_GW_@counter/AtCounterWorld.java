//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

import java.awt.Color;

public class AtCounterWorld extends World<String>
{
   public AtCounterWorld()
   {
   	super(new BoundedGrid<String>(8,8));

      //get the grid

	   //nested loop for rows
	   	//nested loop for cols

				//generate a random 0 or 1

				//if num is a 1
					//add in a @
				//else
					//add in a -


      setMessage("Welcome to the At Counter Lab - -  Click an @ to get the count!");
   }

	public boolean locationClicked(Location loc)
	{
		setMessage("AtCount at " + loc + " is " + countAts(loc));
		return true;
	}

	public int countAts(Location loc)
	{
      //get the grid

      //see if the location is in the grid and check if the cell at that loc is an @
     		//if it is an @ - replace it with a -
     		//recur up, down, left, and right


		return 0;
	}
}