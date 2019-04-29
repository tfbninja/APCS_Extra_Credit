//© A+ Computer Science  -  www.apluscompsci.com

//recursion worksheet key  

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.*;

public class RecursionWorkSheet3KEY
{
/*
	static int fun(int x)
	{
	   if (x<1)
	      return x;
	   else
	      return x + fun(x-3);
	}
	

	static int fun(int x, int y){
	   if(x<=1)
	      return y;
	   else
	      return fun(x-1,y-1)+y;
	}


	static int fun(int x)
	{
	   if (x<1)
	      return x;
	   else
	      return x + fun(x-2);
	}
*/	
	
	static int fun(int x){
	   if(x<1)
	      return 1;
	   else
	      return x+fun(x-1)+fun(x-2);
	}


	public static void main(String[] args)
	{
		System.out.println(fun(5));
	}
}