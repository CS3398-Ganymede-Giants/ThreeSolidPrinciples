package threesolid;

<<<<<<< HEAD
import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
=======
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;

>>>>>>> master


public class TestWorker {

   private  Worker w = new Worker();
<<<<<<< HEAD

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
=======
	
   @Test
   public void testWorkerWithNoName()
   {
      assertEquals(w.getName(),"");
      assertEquals(w.work(),"I'm working already!");
   }

   @Test
   public void testWorkerWithName()
   {
      w.setName("Corvus Glaive");
      assertEquals(w.getName(),"Corvus Glaive");
      assertEquals(w.work(),"Corvus Glaive is working very hard!");
   }

}
>>>>>>> master
