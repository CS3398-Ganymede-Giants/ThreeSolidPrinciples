package threesolid;

// Robot.java
// Provides:
//     public class Robot
// Extends:
//     BaseWorker
// Implements:
//     IReboot reboot()
//
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Interface Segregation (ISP) -- This class implements IReboot for
//     robot workers.
// Single Responsibility (SRP) -- This class is solely responsible for
//     robot workers.

public class Robot extends BaseWorker implements IReboot {
  
  public void reboot() {
    System.out.format("Robot reboot() ... \n");
  }

}
