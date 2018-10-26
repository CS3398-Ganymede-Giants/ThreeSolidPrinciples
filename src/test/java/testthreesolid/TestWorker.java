package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   private  Worker w = new Worker();

   @Test
   @DisplayName("Worker Test")
   public void testWorkerEat()
   {
      fail("Testing if Worker Test fails")
      assertTrue(w.eat());
      assertTrue(w.sick());
      assertTrue(w.work());
   }

}
