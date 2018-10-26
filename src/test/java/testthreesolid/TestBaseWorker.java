package threesolid;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;


public class TestBaseWorker {
	
	   private  BaseWorker bw = new BaseWorker();
   @Test	
   @DisplayName("BaseWorker Test")

	public void testBaseWorkerwork() {
	    assertEquals(bw.work(),"\tIn BaseWorker work method ... \n");
	}

}
