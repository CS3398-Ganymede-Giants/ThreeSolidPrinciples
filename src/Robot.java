package threesolid;

// Robot.java
// Provides:
//     public class Robot
// Implements:
//     IWorkable work()
// 
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Interface Segregation (ISP) -- This class implements IWorkable for
//     robot workers, and any specifics that may require beyond the
//     generic IWorkable interface.
// Single Responsibility (SRP) -- This class is solely responsible for
//     robot workers.


public class Robot implements IWorkable {
	
	public void work() {
		// do something
	}
	
}