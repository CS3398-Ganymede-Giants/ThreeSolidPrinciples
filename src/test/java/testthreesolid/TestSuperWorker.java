package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestSuperWorker {

   private  SuperWorker w = new SuperWorker();

   @Test
   @DisplayName("SuperWorker Test")
   public void testSuperWorker()
   {
      //fail("Testing SuperWorker Test fail");
      assertEquals(w.eat(), true);
      assertEquals(w.sick(), true);
      assertEquals(w.work(), true);
   }

   @Test
   @DisplayName("SuperWorker Fail Test")
   public void testFailSuperWorker()
   {
       try{
           assertEquals(w.eat(), false);
           fail("SuperWorker did not return false");
       }
       catch (org.opentest4j.AssertionFailedError e) {
           System.out.format("\tSuperWorker Fail  ... \n");
       }
   }

}
