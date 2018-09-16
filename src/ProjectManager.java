package threesolid;
// ProjectManager.java
//
// A Subclass
//
// Provides:
// public void schedulework();
// Extends:
// public class Manager
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Single Responsibility (SRP) -- This class is solely responsible for
//    project manager's.
// Interface Segregation (ISP) -- This class doesn't implement any interfaces
// 	  directly.

public class ProjectManager extends Manager {

  @Override
  public void manage() {
    System.out.format("\tProjectManager manage() ...\n");
  }

  public void schedulework() {
    System.out.format("\tProjectManager schedulework() ...\n");
  }

}
