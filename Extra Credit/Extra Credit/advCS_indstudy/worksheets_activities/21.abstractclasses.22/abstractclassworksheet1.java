//© A+ Computer Science  -  www.apluscompsci.com

//abstract class worksheet 1 key   

import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

abstract class Bird
{
  public abstract void fly(); 
}

class Buzzard extends  Bird
{
  public void fly(){
    //code not shown
  }

  public String toString(){
     //code not shown
     return "";
  }
}

class Albatross extends  Bird
{
  public void fly(){
    //code not shown
  }

  public String toString(){
     //code not shown
     return "";
  }
}

class Flock
{
  private List<Bird> flyingV;
  
  public Flock(int size){
    //code not shown
  }

  //adds another bird to the flock
  public void add(Bird bird){
    flyingV.add(bird);
  }

  //makes all birds in the flock fly
  public void allFly(){
     for( Bird b : flyingV ){
        b.fly();
     }
  }

  public String toString(){
     //code not shown
     return "";
  }
}
