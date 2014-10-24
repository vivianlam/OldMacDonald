import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OldMacDonald extends PApplet {


public void setup()
{
	Farm animals=new Farm();
	animals.animalSounds();

}
 class Farm 
{     
  private Animal[] aBunchOfAnimals = new Animal[3];    
  public Farm()    
  {       
   aBunchOfAnimals[0] = new NamedCow("cow","Elsie","moo");          
   aBunchOfAnimals[1] = new Chick("chick","cheep","cluck");
   aBunchOfAnimals[2] = new Pig("pig","oink");    
  }     
  public void animalSounds()    
  {
    for (int nI=0; nI < aBunchOfAnimals.length; nI++) 
    {             
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound() );       
    }       
    System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() );    
  } 
}
 interface Animal 
 {    
   public String getSound();        
   public String getType(); 
 }   

 class Cow implements Animal 
{     
  protected String myType;     
  protected String mySound;      
  public Cow(String type, String sound)    
  {         
     myType = type;         
     mySound = sound;     
  }     
  public Cow()    
  {         
     myType = "unknown";         
     mySound = "unknown";     
  }      
  public String getSound(){return mySound;}     
  public String getType(){return myType;} 
}
 class NamedCow extends Cow
 {
 	private String myName;
 	public NamedCow(String type, String name, String sound)
 	{
 		myName = name;
 		myType = type;
 		mySound = sound;
 	}
 	public String getName(){return myName;}
 }
 class Chick implements Animal
 {
 	private String myType;
 	private String mySound;
 	public Chick(String type, String sound)
 	{
 		myType=type;
 		mySound=sound;
 	}
 	public Chick(String type, String sound1, String sound2)
 	{
 		myType=type;
 		if(Math.random()<0.5f)
 		mySound=sound1;
 		else 
 		mySound=sound2;

 	}
 	public Chick()
 	{
 		myType ="unknown";
 		mySound = "unknown";
 	}
 	public String getSound(){return mySound;}
 	public String getType(){return myType;}
 }
  class Pig implements Animal
  {
  	private String myType;
  	private String mySound;
  	public Pig(String type, String sound)
  	{
  		myType=type;
  		mySound=sound;
  	}
  	public Pig()
  	{
  		myType="unknown";
  		mySound="unknown";
  	}
  	public String getSound(){return mySound;}
  	public String getType(){return myType;}
  }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OldMacDonald" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
