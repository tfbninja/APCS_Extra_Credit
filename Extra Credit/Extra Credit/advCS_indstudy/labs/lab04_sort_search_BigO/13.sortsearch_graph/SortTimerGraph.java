//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class - 
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;

public class SortTimerGraph extends JFrame
{
	private static final int WIDTH = 1024;
	private static final int HEIGHT = 768;

	public SortTimerGraph()
	{
		super("Graphical Sort");
		setSize(WIDTH,HEIGHT);
		
		getContentPane().add(new GraphSort());
						
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		SortTimerGraph run = new SortTimerGraph();
	}
}