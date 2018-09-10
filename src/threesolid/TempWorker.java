package threesolid;

// TempWorker.java
// Provides:
//     public class TempWorker
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
//     ISick for temp workers, and any specifics that may be required
//     beyond the generic interfaces.
// Single Responsibility (SRP) -- This class is solely responsible for
//     temp workers.

public class TempWorker extends BaseWorker implements IEat, ISick {

  // Override BaseWorker work()
  @Override
  public void work() {
    // work function for TempWorker
    System.out.format("TempWorker work() ... \n");
  }

  public void eat() {
    // eat function for TempWorker
    System.out.format("TempWorker eat() ... \n");
  }

  public void sick() {
    // sick function for TempWorker
    System.out.format("TempWorker sick() ... \n");
  }

}
