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
      assertEquals(w.eat(), true);
      assertEquals(w.sick(), true);
   }

   // @Test
   // @DisplayName("With Name Test")
   // public void testWorkerWithName()
   // {
   //    w.setName("Corvus Glaive");
   //    assertEquals(w.getName(),"Corvus Glaive");
   //    assertEquals(w.work(),"Corvus Glaive is working very hard!");
   // }

}
