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

@Test
	public void testBaseWorkerwork() {
	    assertEquals(w.work(),"\tIn BaseWorker work method ... \n");
	}

}
