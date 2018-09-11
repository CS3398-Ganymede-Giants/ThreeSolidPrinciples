// IWorkable.java
//
// An Interface
//
// Provides:
// public void work();
//
// Seperated Eat and Work
// to comply with SRP (single responsibility principle)
// and ISP (Interface segragtion principle)
// By seperating these allows the robot class to
// only implement the workable interface since robots
// don't eat.

package threesolid;

public interface IWorkable {

  void work();  
}
