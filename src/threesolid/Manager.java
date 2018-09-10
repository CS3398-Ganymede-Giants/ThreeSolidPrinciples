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
//     directly.

public class Manager {

  // manage something
  public void manage() {
    System.out.format("Manager manage() ... \n");
  }
}
