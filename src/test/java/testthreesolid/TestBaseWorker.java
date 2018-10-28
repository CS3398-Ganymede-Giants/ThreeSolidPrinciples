package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestBaseWorker {
	
	   private  BaseWorker bw = new BaseWorker();
   @Test
   @DisplayName("TestBaseWorker")

	public void testBaseWorkerwork() {
	    assertEquals(bw.work(), true);
	}

   @Test
   @DisplayName("BaseWorker Fail Test")
   public void testFailSuperWorker()
   {
       try{
           assertEquals(bw.work(), false);
           fail("BaseWorker did not return false");
       }
       catch (org.opentest4j.AssertionFailedError e) {
           System.out.format("\tBaseWorker Fail  ... \n");
       }
   }

}
