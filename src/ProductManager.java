package threesolid;
// ProjectManager.java
//
// A Subclass
//
// Provides:
// public void defineproduct();
// Extends:
// public class Manager
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Single Responsibility (SRP) -- This class is solely responsible for
//    product manager's.
// Interface Segregation (ISP) -- This class doesn't implement any interfaces
// 	  directly.

public class ProductManager extends Manager {

  @Override
  public void manage() {
    System.out.format("ProductManager manage() ...\n");
  }

  public void defineproduct() {
    System.out.format("ProductManager defineproduct() ...\n");
  }

}
