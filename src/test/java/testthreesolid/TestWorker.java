package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   private  Worker w = new Worker();

   @Test
   @DisplayName("Worker Eat Pass Test")
   public void testWorker.eat()
   {
      assertEquals(w.eat(), true);
   }

   @Test
   @DisplayName("Worker Sick Fail Test")
   public void testWorker.sick()
   {
      assertEquals(w.sick(), false);
   }

   @Test
   @DisplayName("Worker Work Pass Test")
   public void testWorker.work()
   {
      assertEquals(w.work(), true);
   }

}
