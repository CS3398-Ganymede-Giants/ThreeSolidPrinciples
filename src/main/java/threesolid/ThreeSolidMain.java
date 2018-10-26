package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

<<<<<<< HEAD

/*
ThreeSolidMain.java
Provides
 public class ThreeSolidMain
SOLID Principles
 Single Responsibility Principle:
   At this very moment, this class has the Sole Responsibility of starting
   the ThreeSolid program.
Not Used:
 Open/Close Principle
   This class is not open for extension, and this class is also open for
   modification. Therefore this class does not fit the OCP.
 Interface Segregation Principle
   This class does not implement any interfaces, therefore the ISP is not used
   in this class.
*/

/*
███    ███  █████  ██ ███    ██
████  ████ ██   ██ ██ ████   ██
██ ████ ██ ███████ ██ ██ ██  ██
██  ██  ██ ██   ██ ██ ██  ██ ██
██      ██ ██   ██ ██ ██   ████
*/



public class ThreeSolidMain
{
  
    //Class Instantiations
    //Worker
    public static BaseWorker testBaseWorker = new BaseWorker();
    public static Worker testWorker = new Worker();
    public static SuperWorker testSuperWorker = new SuperWorker();
    public static TempWorker testTempWorker = new TempWorker();
    //Manager 
    public static Manager testManager = new Manager();
    public static ProjectManager testProjectManager = new ProjectManager();
    public static ProductManager testProductManager = new ProductManager();
    //Robot
    // threesolid.Robot conflicts with java.awt.Robot so it must be specified
    public static threesolid.Robot testRobot = new threesolid.Robot();


   // The entry main() method
   public static void main(String[] args)
   {

      try
      {
         System.out.format("Starting ... \n");
      }
=======
//import threesolid.IWorker;


public class ThreeSolidMain
{   

   public static Manager tsManager = new Manager();

   // The entry main() method
   public static void main(String[] args) 
   {
 
      try 
      {
         System.out.format("Starting ... \n");               
      } 
>>>>>>> master
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

<<<<<<< HEAD
      // Test all functions of class instances
      //BaseWorker
      System.out.format("BaseWorker:\n");
      testBaseWorker.work();
      //Worker
      System.out.format("\nWorker:\n");
      testWorker.eat();
      testWorker.sick();
      testWorker.work();
      //Robot
      System.out.format("\nRobot:\n");
      testRobot.reboot();
      testRobot.work();
      //SuperWorker
      System.out.format("\nSuperWorker:\n");
      testSuperWorker.eat();
      testSuperWorker.sick();
      testSuperWorker.work();
      //TestWorker
      System.out.format("\nTestWorker:\n");
      testTempWorker.eat();
      testTempWorker.sick();
      testTempWorker.work();
      //Manager
      System.out.format("\nManager:\n");
      testManager.manage();
      //ProductManager
      System.out.format("\nProductManager:\n");
      testProductManager.manage();
      testProductManager.defineproduct();
      //ProjectManager
      System.out.format("\nProjectManager:\n");
      testProjectManager.manage();
      testProjectManager.schedulework();


      try
      {
         System.out.format("Stopping ... \n");
      }
=======
            try 
      {
         System.out.format("Stopping ... \n");               
      } 
>>>>>>> master
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
<<<<<<< HEAD
}

=======
 }

// interface segregation principle - good example
interface IWorker {
	public String work();
	public String eat();
}   

class Worker implements IWorker{
	private String name = "";

  	public String getName() 
  	{
    	return name;
  	}

  	public void setName(String name) 
  	{
      	this.name = name;
  	}

  	public String work() 
  	{
  		if (name == "") 
    	{
       		return "I'm working already!";
    	}
    	else 
    	{
       		return name + " is working very hard!";
    	}
	}

	public String eat() 
	{
		if (name == "") 
    	{
       		return "I'm eating already!";
    	}
    	else 
    	{
    		return name + " is eating a double cheeseburger with special sauce and bacon flavored Skittles!";
    	}
	}
}

class SuperWorker implements IWorker{
	public String work() {
		return "I'm a super worker!";
	}

	public String eat() {
		return "I'm eating a super healthy meal";
	}
}

class Manager {
	IWorker worker;

	public void Manager() {

	}
	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}
>>>>>>> master
