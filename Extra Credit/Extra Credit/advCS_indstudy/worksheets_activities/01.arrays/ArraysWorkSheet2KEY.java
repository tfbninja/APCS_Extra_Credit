//© A+ Computer Science  -  www.apluscompsci.com

//arrays worksheet 2   

import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Character.*;
import static java.lang.Double.*;

public class ArraysWorkSheet2KEY
{
	public static void main(String[] args)
	{
		double[] fun = {2.1,4.5,9.6,4.3,0.0,0.5,1.6};
		
		System.out.println(fun[0]);				// LINE 1
		
		System.out.println(fun[2]);				// LINE 2
		
		System.out.println(fun[3]);				// LINE 3
		
		System.out.println(fun[6]);				// LINE 4
		
		System.out.println(fun [0]+ fun [2]);			// LINE 5
		
		System.out.println(fun [1]+ fun[2/5]);		// LINE 6
		
		System.out.println(fun[5*2/8]);				// LINE 7
		
		System.out.println(fun[9/3]);				// LINE 8
		
		System.out.println(fun.length);				// LINE 9
		
		System.out.println(fun.length/2);			// LINE 10


		int[] nums = new int[5];	//assume all spots are set to 0
		for(int i=0; i<nums.length; i++) 
		{      
		   nums[i] = i+3*2;
		   out.println(Arrays.toString(nums));
		   out.println(nums[i]);		
		} 
	}
}