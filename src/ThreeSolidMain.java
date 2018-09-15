package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;
import threesolid.*;      // Use threesolid

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

public class ThreeSolidMain
{
   public static BaseWorker testBaseWorker = new BaseWorker();
   public static Manager testManager = new Manager();
   public static ProjectManager testProjectManager = new ProjectManager();
   public static ProductManager testProductManager = new ProductManager();
   public static Worker testWorker = new Worker();
   public static SuperWorker testSuperWorker = new SuperWorker();
   public static TempWorker testTempWorker = new TempWorker();
   // threesolid.Robot conflicts with java.awt.Robot so it must be specified
   public static threesolid.Robot testRobot = new threesolid.Robot();


   // The entry main() method
   public static void main(String[] args)
   {

      try
      {
         System.out.format("Starting ... \n");
      }
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      // Test all functions
      System.out.format("BaseWorker:\n");
      testBaseWorker.work();
      System.out.format("\nWorker:\n");
      testWorker.eat();
      testWorker.sick();
      testWorker.work();
      System.out.format("\nRobot:\n");
      testRobot.reboot();
      testRobot.work();
      System.out.format("\nSuperWorker:\n");
      testSuperWorker.eat();
      testSuperWorker.sick();
      testSuperWorker.work();
      System.out.format("\nTestWorker:\n");
      testTempWorker.eat();
      testTempWorker.sick();
      testTempWorker.work();
      System.out.format("\nManager:\n");
      testManager.manage();
      System.out.format("\nProductManager:\n");
      testProductManager.manage();
      testProductManager.defineproduct();
      System.out.format("\nProjectManager:\n");
      testProjectManager.manage();
      testProjectManager.schedulework();


      try
      {
         System.out.format("Stopping ... \n");
      }
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
}

