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
     assertTrue("\tWorker eat() ... \n", true);
     assertTrue("Worker doesn't eat", false);

     assertTrue("\tWorker sick() ... \n", true);
     assertTrue("Worker isn't sick", false);

   }
   public void newtestZMWorkerFail()
   {
     assertFalse("\tWorker eat() ... \n", true);
     assertFalse("Worker doesn't eat", false);

     assertFalse("\tWorker sick() ... \n", true);
     assertFalse("Worker isn't sick", false);
   }
}
