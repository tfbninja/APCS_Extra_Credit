//© A+ Computer Science  -  www.apluscompsci.com

//inheritance worksheet 3  key  

import static java.lang.System.*;

class J{
   public J() { x = y = 3;}
   public void fun() { x = y = 6; }
   public int back() { return 1; }
   public String toString() { 
      return x + " " + y;
   }
   private int x, y;
}

class K extends J {
   public void fun() { out.println(back()); }
   public String toString() { 
      return "class K " + super.toString();
   }
}

class M{
   private int x, y;
   public M() { x=8; y=1; }
   public double fun() { return x; }
   public double go() { return y; }
   public double back() { return fun(); }
   public String toString() { 
      return x + " " + y;
   }
}

class N extends M{
   public N() { }
   public double fun() { return 7; }
   public double go() { return super.back(); }
   public double back() { return 2; }
   public String toString() { 
      return super.toString();
   }
}

public class InheritWorkSheet3KEY
{
	public static void main(String[] args)
	{
		out.println("\n\nquest 1");	
		//test code in the main method
		J one = new J();
		out.println(one);
		one = new K();
		one.fun();
		out.println(one);


		out.println("\n\nquest 2");	
		//test code in a main method
		M two = new M();
		out.println(two.go());
		out.println(two.back());
		out.println(two.fun());
		out.println(two);
		two = new N();      
		out.println(two.go());
		out.println(two.back());
		out.println(two.fun());
		out.println(two);
	}
}