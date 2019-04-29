//© A+ Computer Science  -  www.apluscompsci.com

//recursion worksheet key  

import java.util.*;
import static java.lang.System.*;

public class RecursionWorkSheet4KEY
{
	public static int fun(int x)
	{
	   if(x<1)
	      return 1;
	   else
	      return x+fun(x-1)+fun(x-2);
	}

	public static int go(int x)
	{
	   if(x<1)
	      return 1;
	   else
	      return x+go(x-2)+go(x-3);
	}
	
	public static int fly(int x)
	{
	   if(x<1)
	      return 1;
	   else
	      return x+fly(x-4)+fly(x-1);
	}


	public static void main(String[] args)
	{
		System.out.println("#1 - "+fun(2));
		System.out.println("#2 - "+fun(6));
		System.out.println("#3 - "+go(5));
		System.out.println("#4 - "+go(3));
		System.out.println("#5 - "+fly(4));
		System.out.println("#6 - "+fly(5));		
	}
}