package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

/*
ThreeSolidMain.java 
Provides
 public class ThreeSolidMain 

SOLID Principles
 Single Responsibility Principle:
   At this very moment, this class has the Sole Responsibility of initializing the Manager class with the 
     tsManager Object, therefore it follows the SRP.
Not Used:
 Open/Close Principle
   This class is not open for extension, and this class is also open for modification. 
     Therefore this class does not fit the OCP.
 Interface Segregation Principle
   This class does not implement any interfaces, therefore the ISP is not used in this class.
*/

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
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

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

