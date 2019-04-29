//© A+ Computer Science  -  www.apluscompsci.com

//inheritance worksheet 1 key  

import static java.lang.System.*;

class A{
   private int x;
   public A() { x =3;}
   public String toString() { 
      return ""+x;
   }
}

class B extends A{
}


class C{
   private int x;
   public C() { x =3;}
   public void setX(int val){
   	x=val;
   }
   public int getX(){
   	return x;
   }
   public String toString() { 
      return ""+getX();
   }
}

class D extends C{
}

class E{
   private int x;
   public E() { x =3;}
   public E(int val){
   	x=val;
   }
   public String toString() { 
      return ""+x;
   }
}

class F extends E{
	public F(){ }
	public F(int num){
	   super(num);
	}
}

public class InheritWorkSheet1KEY
{
	public static void main(String[] args)
	{
		//test code in the main method
		A one = new A();
		out.println(one);
		one = new B();
		out.println(one);
	
		//test code in the main method
		C two = new C();
		out.println(two);
		two = new D();
		two.setX(9);
		out.println(two);	
		two.setX(-12);
		out.println(two.getX());	

		//test code in the main method
		E three = new E();
		out.println(three);	
		three = new F(45);	
		out.println(three);
	}
}