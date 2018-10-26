package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestSuperWorker {

   private  SuperWorker w = new SuperWorker();

   @Test
   @DisplayName("SuperWorker Pass Test")
   public void testSuperWorker()
   {
      assertEquals(w.eat(), true);
      assertEquals(w.sick(), true);
      assertEquals(w.work(), true);
   }

   @Test
   @DisplayName("SuperWorker Fail Test")
   public void testSuperWorker()
   {
      assertEquals(w.eat(), false);
      assertEquals(w.sick(), false);
      assertEquals(w.work(), false);
   }

}
