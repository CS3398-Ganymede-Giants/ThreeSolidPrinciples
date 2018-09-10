package threesolid;

// SuperWorker.java
// Provides:
//     public class SuperWorker
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
// Interface Segregation (ISP) -- This class implements IEat and
//     ISick for super workers, and any specifics that may be required
//     beyond the generic interfaces.
// Single Responsibility (SRP) -- This class is solely responsible for
//     super workers.

public class SuperWorker extends BaseWorker implements IEat, ISick {

  // Override BaseWorker work()
  @Override
  public void work() {
    // work function for SuperWorker
    System.out.format("SuperWorker work() ... \n");
  }

  public void eat() {
    // eat function for SuperWorker
    System.out.format("SuperWorker eat() ... \n");
  }

  public void sick() {
    // sick function for SuperWorker
    System.out.format("SuperWorker sick() ... \n");
  }

}
