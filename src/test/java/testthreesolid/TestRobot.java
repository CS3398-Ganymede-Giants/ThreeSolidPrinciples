package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestRobot {

   private  Robot r = new Robot();

   @Test
   @DisplayName("Robot Test")
   public void testRobot()
   {
      //fail("Worker Test fail condition");
      assertEquals(r.reboot(), true);
    //   assertEquals(w.sick(), true);
    //   assertEquals(w.work(), true);
   }

   @Test
   @DisplayName("Robot Fail Test")
   public void testFailRobot()
   {
       try{
           assertEquals(r.eat(), false);
           fail("Robot did not return false");
       }
       catch (org.opentest4j.AssertionFailedError e) {
           System.out.format("\tRobot Fail  ... \n");
       }
   }

}
