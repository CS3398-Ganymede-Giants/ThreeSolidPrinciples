package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   private  Worker w = new Worker();

   @Test
   @DisplayName("Worker Test")
   public void newtestZMWorkerPass()
   {
     assertTrue(w.eat(), true);
     assertTrue(w.sick(), true);
   }
   public void newtestZMWorkerFail()
   {
     try {
       assertTrue(w.eat(), false);
       Assert.fail("should raise exception");
      } catch (Exception e) {
       //
     }
     try {
       assertTrue(w.sick(), false);
       Assert.fail("should raise exception");
      } catch (Exception e) {
       //
     }
   }
}
