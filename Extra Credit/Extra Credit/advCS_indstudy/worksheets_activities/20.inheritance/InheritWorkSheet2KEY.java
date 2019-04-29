//© A+ Computer Science  -  www.apluscompsci.com

//inheritance worksheet 2 key  

import static java.lang.System.*;

class G{
   private int x;
   public G() { x=3;}
   public void setX(int val){
      x=val;
   }
   public String toString(){ 
      return ""+x;
   }
}

class H extends G{
   private int y;
   public H() { y=4;}
   public void setY(int val){
      y=val;
   }
   public String toString() { 
      return ""+y+" "+super.toString();
   }
}


public class InheritWorkSheet2KEY
{
	public static void main(String[] args)
	{
		out.println("\n\nquest 1");	
		//test code in the main method
		G one = new G();
		out.println(one);
		one.setX(5);
		out.println(one);
		H two = new H();
		two.setX(-2);
		two.setY(11);
		out.println(two);
		
		out.println("\n\nquest 2");	
		//test code in the main method
		G three = new H();
		out.println(three);
		three.setX(8);
//		three.setY(21);			//ERROR
		out.println(three);


		out.println("\n\nquest 3");	
		//test code in the main method
		G four = new H();
		four.setX(11);
		out.println(four);
		four.setX(6);
		((H)four).setY(14);
		out.println(four);

		out.println("\n\nquest 4");	
		//test code in the main method
		H five= new H();
		five.setY(7);
		out.println(five);
		five.setX(16);
		five.setY(9);
		out.println(five);
		
	}
}