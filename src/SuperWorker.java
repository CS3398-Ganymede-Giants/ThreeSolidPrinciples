package threesolid;

// SuperWorker.java
// Provides:
//     public class SuperWorker
//     extraWork()
// Extends:
//     public class Worker
// Implements:
//     IWorkable work()
//     IFeedable eat()
//
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Interface Segregation (ISP) -- This class implements IWorkable and
//     IFeedable for super workers, and any specifics that may be required
//     beyond the generic interfaces.
// Single Responsibility (SRP) -- This class is solely responsible for
//     super workers.

public class SuperWorker extends Worker implements IWorkable, IFeedable {
	
	public void work() {
		// do something super 
	}
	
	public void extraWork() {
		// do something more
	}
	
	public void eat() {
		// do something
	}

}