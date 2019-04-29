//© A+ Computer Science  -  www.apluscompsci.com

//inheritance worksheet 4 key  

import static java.lang.System.*;

class P 
{
   private int x, y;   

   public P() { x=7;  y=0;  }
   public P(int v){x=v; y=7;}
   
   public double fun() { return x; }
   public void go() { back();  } 
   public void whoot() { go(); }
   public void back() { 
      x=992; 
   }
   public String toString() 
   { 
      return getClass().getName() + " "  + x + " " + y;
   }
}

class Q extends P 
{
   private int x;

   public Q() { x=23;  } 
   public Q(int v) { super(v); x=33;  }
   
   public double fun() { return x; }
   public void go() { back();  }
   public void back() { 
      x=45; 
   }

   public String toString() 
   { 
      return "class " + getClass().getName() + " " + x
                      + " " +  super.toString() ;
   }
}

public class InheritWorkSheet4KEY
{
	public static void main(String[] args)
	{
		out.println("\n\nquest 1");	
		//code int the main of another class
		P one = new P();
		out.println(one.fun());
		one.go();
		one.whoot();
		System.out.println(one+"\n\n" );
		one = new Q();
		out.println(one.fun());
		one.go();
		one.whoot();
		System.out.println(one);
	}
}