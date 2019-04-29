//© A+ Computer Science  -  www.apluscompsci.com

//inheritance worksheet 2 key

import static java.lang.System.*;    

abstract class Dinosaur
{
   private String dName;
   private boolean hungry; 

   public Dinosaur()
   {
      dName = "";
      hungry=false;      
   }

   public Dinosaur(String name)
   {
      dName = name;
      hungry=false;      
   }

   public Dinosaur(String name, boolean hunger)
   {
      dName = name;
      hungry=hunger;      
   }

   public abstract String roar();

   public boolean getHungry(){
     return hungry;
   }

   public String toString()
   {
      return dName;
   }
}


class Allosaur extends Dinosaur
{
  public Allosaur(){
    super();
  }

  public Allosaur(String name){
    super(name);
  }

  public Allosaur(String name, boolean hungry){
    super(name, hungry);
  }

  public String roar(){
    if(getHungry())
      return "HUNGRRRRRRRY";
    return "RRRRRRR";
  }

  public String toString(){
    return super.toString() + " " + roar();
  }
}


public class AbstractClassWorkSheet2KEY
{
	public static void main(String[] args)
	{
		out.println("\n\nquest 1");	
		Allosaur x = new Allosaur("BigUn");
		out.println(x);	
	}
}