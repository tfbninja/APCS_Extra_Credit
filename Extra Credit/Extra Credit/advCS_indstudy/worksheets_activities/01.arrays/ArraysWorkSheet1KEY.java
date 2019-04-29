//© A+ Computer Science  -  www.apluscompsci.com
 
//arrays worksheet 1  

import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Character.*;
import static java.lang.Double.*;

public class ArraysWorkSheet1KEY
{
	public static void main(String[] args)
	{
		int[] nums = {9,4,2,7,3,23,45,24,17,1,11};

		System.out.println(nums[0]);									// LINE 1
		
		System.out.println(nums[2]);									// LINE 2
		
		System.out.println(nums[5]);									// LINE 3
		
		System.out.println(nums.length);								// LINE 4
		
		System.out.println(nums[1+5]);								// LINE 5
	
		System.out.println(nums[10/3]);								// LINE 6
		
		System.out.println(nums[2*2]);								// LINE 7
		
		System.out.println(nums[nums[0]+1]);					// LINE 8
		
		System.out.println(nums[nums[1]+nums[4]]);		// LINE 9
		
		System.out.println(nums.length/2);							// LINE 10
	}
}