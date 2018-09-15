package threesolid;

// ProductManager.java
// Provides:
//     public class ProductManager
// Extends:
//     public class Manager
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Single Responsibility (SRP) -- This class has a single responsibility
//    for ProductManagers.
// Interface Segregation (ISP) -- This class does not implement any interfaces
//    directly.

public class ProductManager extends Manager {

  public void defineproduct() {
    // defineproduct function for ProductManager
    System.out.format("ProductManager defineproduct() ... \n");
  }

}
