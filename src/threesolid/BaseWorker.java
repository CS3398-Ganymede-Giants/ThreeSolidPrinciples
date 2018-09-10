package threesolid;

// BaseWorker.java
// Provides:
//    public class BaseWorker
//    public void work()
//
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Interface Segregation (ISP) -- This class does not use or provide an
//     interface.
// Single Responsibility (SRP) -- This class is solely responsible for
//     the BaseWorker.

public class BaseWorker {

  public void work() {
    // base work() function for package
    System.out.format("BaseWorker work() ... \n");
  }

}
