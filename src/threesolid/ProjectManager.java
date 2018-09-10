package threesolid;

// ProjectManager.java
// Provides:
//     public class ProjectManager
// Extends:
//     public class Manager
// Implements:
//     IScheduleWork schedulework()
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Single Responsibility (SRP) -- This class has a single responsibility
//    for ProjectManagers.
// Interface Segregation (ISP) -- This class implements schedulework for
//     ProjectManager

public class ProjectManager extends Manager implements IScheduleWork {

  public void schedulework() {
    // schedulework function for ProjectManager
    System.out.format("ProjectManager schedulework() ... \n");
  }

}
