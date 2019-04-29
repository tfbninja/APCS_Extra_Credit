//© A+ Computer Science  -  www.apluscompsci.com

//inheritance worksheet 5 key    

import static java.lang.System.*;

class J
{
   private static int x;
   public J() { x++;}
   public String toString() { 
      return ""+x;
   }
}

class M{
   public M() { c++; }
   public double fun() { return 5; }
   public double back() { return fun(); }
   public String toString() { 
      return x + " " + y + " " + c;
   }
   public static int count() { return c; }
   private int x, y;
   private static int c;
}

class N extends M{
   public N() { }
   public double fun() { return 7; }
   public double go() { return super.back(); }
   public double back() { return 2; }
   public String toString() { 
      return "class N " + super.toString();
   }
}

public class InheritWorkSheet5KEY
{
	public static void main(String[] args)
	{
		out.println("\n\nquest 1");	
		//test code in the main method
		J one = new J();
		one = new J();
		one = new J();
		out.println(one);
		one = new J();
		one = new J();
		one = new J();
		one = new J();
		one = new J();
		out.println(one);


		out.println("\n\nquest 2");	
		//test code in a main method
		M two = new M();
		out.println(M.count());
		two = new M();
		two = new N();
		out.println(two.fun());
		two = new N();      
		out.println(((N)two).go());
		two = new M();
		two = new N();
		out.println(two);
		out.println(N.count());
	}
}