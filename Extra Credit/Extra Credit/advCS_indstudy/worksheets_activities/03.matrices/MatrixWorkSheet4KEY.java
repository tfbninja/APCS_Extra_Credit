//A+ Computer Science - www.apluscompsci.com

import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Character.*;
import static java.lang.Double.*;     

class Matrix
{
	private int[][] mat = {{1,2},{3,4},{5,6},{7,8},{9,10},{1,2},{1,7}};


	//replaceAll will replace all oldVal with newVal
	public void replaceAll(int oldVal, int newVal)
	{
		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[r].length;c++)
			{
			   if(mat[r][c]==oldVal)
			      mat[r][c]=newVal;	
			}			
		}	
	}

	//swapRows will swap rowOne and rowTwo
	public void swapRows(int rowOne, int rowTwo)
	{
		int[] temp = mat[rowOne];
		mat[rowOne]=mat[rowTwo];
		mat[rowTwo]=temp;	
	}
	
	public String toString()
	{
		String output="";
		for(int r=0; r<mat.length; r++)
		{
			output+="row "+ r + " ";
			for(int c=0; c<mat[0].length; c++)
			{
				output+=String.format("%4d",mat[r][c]);
			}
		   output+="\n";
		}
		return output;	
	}	
}

public class MatrixWorkSheet4KEY
{
	public static void main(String[] args)throws Exception
	{
		Matrix test = new Matrix();
		test.replaceAll(1,25);
		out.println(test);
		test.swapRows(2,4);
		out.println(test);				
	}
}