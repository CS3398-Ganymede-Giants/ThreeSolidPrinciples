package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestSuperWorker {

   private  SuperWorker w = new SuperWorker();

   @Test
   @DisplayName("SuperWorker Test")
   public void testSuperWorker()
   {
      fail("Testing SuperWorker Test fail");
      assertTrue(w.eat());
      assertTrue(w.sick());
      assertTrue(w.work());
   }

}
