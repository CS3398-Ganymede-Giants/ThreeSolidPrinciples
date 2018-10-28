package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestTempWorker {

   private  TempWorker tW = new TempWorker();

   @Test
   @DisplayName("TempWorker Test")
   public void testTempWorker()
   {
      //fail("Worker Test fail condition");
      assertEquals(tW.eat(), true);
      assertEquals(tW.sick(), true);
      assertEquals(tW.work(), true);
   }

   @Test
   @DisplayName("TempWorker Fail Test")
   public void testFailTempWorker()
   {
       try{
           assertEquals(tW.eat(), false);
           fail("TempWorker did not return false");
       }
       catch (org.opentest4j.AssertionFailedError e) {
           System.out.format("\tTempWorker Fail  ... \n");
       }
   }

}
