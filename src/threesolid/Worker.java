package threesolid;

// Worker.java
// Provides:
//     public class Worker
// Extends:
//     public class BaseWorker
// Implements:
//     IEat eat()
//     ISick sick()
//
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Interface Segregation (ISP) -- This class implements IEat and ISick
//     for workers, and any specifics that may be required beyond the
//     generic interfaces.
// Single Responsibility (SRP) -- This class is solely responsible for
//     workers.

public class Worker extends BaseWorker implements IEat, ISick {

  public void eat() {
    // eat function for Worker
    System.out.format("Worker eat() ... \n");
  }

  public void sick() {
    // sick function for Worker
    System.out.format("Worker sick() ... \n");
  }

}
