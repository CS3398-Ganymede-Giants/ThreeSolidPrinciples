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
// Interface Segregation (ISP) -- This class doesn't implement any interfaces
// 	  directly.

public class Manager {

		public boolean manage() {
			System.out.format("\tManager manage() ...\n");
      return true;
		}
}
