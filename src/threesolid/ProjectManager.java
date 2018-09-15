package threesolid;

// ProjectManager.java
// Provides:
//     public class ProjectManager
// Extends:
//     public class Manager
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Single Responsibility (SRP) -- This class has a single responsibility
//    for ProjectManagers.
// Interface Segregation (ISP) -- This class does not implement any interfacces
//    directly.

public class ProjectManager extends Manager {

  public void schedulework() {
    // schedulework function for ProjectManager
    System.out.format("ProjectManager schedulework() ... \n");
  }

}
