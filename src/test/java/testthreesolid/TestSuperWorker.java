package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestSuperWorker {

   private  SuperWorker w = new SuperWorker();

   @Test
   @DisplayName("SuperWorker Eat Pass Test")
   public void testSuperWorker.eat()
   {
      assertEquals(w.eat(), true);
   }

   @Test
   @DisplayName("SuperWorker Sick Fail Test")
   public void testSuperWorker.sick()
   {
      assertEquals(w.sick(), false);
   }

   @Test
   @DisplayName("SuperWorker Work Pass Test")
   public void testSuperWorker.work()
   {
      assertEquals(w.work(), true);
   }

}
