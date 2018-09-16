package threesolid;
// Worker.java
// Provides:
//    public class Worker
// Extends:
//    BaseWorker
// Implements:
//    IEat eat()
//    ISick sick()
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension,
//   but closed for modification
// Interface Segregation (ISP) -- This class implements IEat and ISick
//  for Workers.
// Single Responsibility (SRP) -- This class is only responsible for Workers.
//
public class Worker extends BaseWorker implements IEat,ISick {

  public void eat() {
    System.out.format("\tWorker eat() ... \n");
  }
  public void sick() {
    System.out.format("\tWorker sick() ... \n");
  }

}
