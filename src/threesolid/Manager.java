package threesolid;

// Manager.java
// Provides:
//     public class Manager
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Single Responsibility (SRP) -- This class has a single responsibility
//    for Managers.
// Not Used:
// Interface Segregation (ISP) -- This class does not implement any interfaces
// 	  directly.

public class Manager {

	// create a worker
	Worker myWorker;

	// make Worker do work
	public void manage(Worker w) {
		w.work();
	}
}
