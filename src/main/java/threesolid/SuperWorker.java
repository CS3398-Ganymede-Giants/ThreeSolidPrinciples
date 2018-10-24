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
  public boolean work() {
    System.out.format("\tSuperWorker work() ... \n");
    return true;
  }

  public boolean eat() {
    System.out.format("\tSuperWorker eat() ... \n");
    return true;
  }

  public boolean sick() {
    System.out.format("\tSuperWorker sick() ... \n");
    return true;
  }

}
