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

public class GarbageCollector extends World<ColoredCell>
{
   public GarbageCollector()
   {
   	super(new BoundedGrid<ColoredCell>(8,8));
   	
      //get the grid
	   
	   //nested loop for rows
	   	//nested loop for cols
	   	   
				//generate a random # 0 or 1
				
				//if num is a 1
					//add a new orange cell
				//else
				

      setMessage("Welcome to the Garbage Collector  - -  Click an orange spot!");   	  	
   }

	public boolean locationClicked(Location loc)
	{
		pickUpTrash(loc);
		return true;      
	}
   
	public void pickUpTrash(Location loc)
	{
      //get the grid
      
      //see if the location is in the grid and check if the cell at that loc is on
     		//if it is on - turn it off
     		//recur up, down, left, and right



	}
}