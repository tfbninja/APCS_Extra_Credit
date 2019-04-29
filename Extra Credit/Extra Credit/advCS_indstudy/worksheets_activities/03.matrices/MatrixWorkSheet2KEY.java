//A+ Computer Science - www.apluscompsci.com

import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Character.*;
import static java.lang.Double.*;   

public class MatrixWorkSheet2KEY
{
	public static void main(String[] args)throws Exception
	{
		int[][] mat = new int[4][8];
				
		for(int r=0;r<mat.length;r++)
		{
		  for(int c=0;c<mat[r].length;c++)
		  {
		     mat[r][c]=r*c+c/2+r*(c+1);
		  }
		}
		
		out.println(mat[0][2]);				//1. ____________________
		
		out.println(mat[0][3]);				//2. ____________________
		
		out.println(mat[0][7]);				//3. ____________________
		
		out.println(mat[1][4]);				//4. ____________________
		
		out.println(mat[1][6]);				//5. ____________________
		
		out.println(mat[2][0] + mat[0][0]);		//6. ____________________
		
		out.println(mat[2][2]);				//7. ____________________
		
		out.println(mat[2][5] - mat[1][1]);		//8. ____________________
		
		out.println(mat[2][7]);				//9. ____________________
		
		out.println(mat[3][4]);				//10. ____________________
		
		out.println(mat[3][6] / mat[2][1]);		//11. ____________________
		
		int spot = (mat[1][1]+mat[1][2])/3;
		out.println(mat[spot][spot]);			//12. ____________________
	}
}