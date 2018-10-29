package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestManager {
    private Manager m = new Manager();

    @Test
    @DisplayName("<T-hooks>  Manager Test")
    public void testManager()
    {
      assertEquals(m.manage(),true);
    }

    @Test
    @DisplayName("<T-hooks> Manager Fail Test")
    public void testFailManager(){
      try{
          assertEquals(m.manage(),false);
          fail("Manager did not return false");
      }
      catch (org.opentest4j.AssertionFailedError e) {
          System.out.format("\tManager Fail  ... \n");
      }
   }
}
