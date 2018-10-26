package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   private  Worker w = new Worker();

   @Test
   @DisplayName("Worker Pass Test")
   public void testPassWorker()
   {
      assertEquals(w.eat(), true);
      assertEquals(w.sick(), true);
   }

   @Test
   @DisplayName("Worker Fail Test")
   public void testFailWorker()
   {
      assertEquals(w.eat(), false);
      assertEquals(w.sick(), false);
   }

}
