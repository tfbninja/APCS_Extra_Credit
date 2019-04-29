//© A+ Computer Science  -  www.apluscompsci.com

//recursion worksheet key     

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class RecursionWorkSheetKEY
{

/*
	static void fun(int x)
	{
	   if(x>=1){
	      out.print(x);
	      fun(x-1);
	   }
	}


	static void fun(int x)
	{
	   if(x<1){
	      out.print(x);
	   }else{
	      out.print(x);
	      fun(x-1);
	   }
	}


	static int fun(int x)
	{
	   if (x<1)
	      return x;
	   else
	      return x + fun(x-1);
	}
*/
	
	static int fun( int x, int y)
	{
	  if( y == 2)
	    return x;
	  else
	    return fun( x, y - 1) + x;
	}/*	
*/	
	public static void main(String[] args)
	{
		//	fun(3);
		//System.out.println(fun(3));
		System.out.println(fun(4,2));
	}
}