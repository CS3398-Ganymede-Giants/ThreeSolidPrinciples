package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   private  Worker w = new Worker();

   @Test
   @DisplayName("Worker Test")
   public void testWorker()
   {
      //fail("Worker Test fail condition");
      assertEquals(w.eat(), true);
      assertEquals(w.sick(), true);
      assertEquals(w.work(), true);
   }

}
