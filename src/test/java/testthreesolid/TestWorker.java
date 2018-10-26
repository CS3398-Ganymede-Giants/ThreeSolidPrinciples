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
     w.eat(true);
     w.sick(true);
   }
   public void newtestZMWorkerFail()
   {
     try {
       w.eat(false);
       Assert.fail("should raise exception");
      } catch (Exception e) {
       //
     }
     try {
       w.sick(false);
       Assert.fail("should raise exception");
      } catch (Exception e) {
       //
     }
   }
}
