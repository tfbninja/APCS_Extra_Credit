//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color; 
import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

public class SearchWorld extends ActorWorld
{
	public SearchWorld()
	{
		super(new BoundedGrid<Actor>(50,50));
		//nested loops to load random actors of random colors into the world	
	}

	public SearchWorld(int rows, int cols)
	{
		//use the constructor above as an example
	}
	
	public int getNumXColoredActors(Color col)
	{
	   return -1;
	}   
}