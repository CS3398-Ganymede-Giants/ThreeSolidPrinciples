package threesolid;

// ISick.java
//
// An Interface
//
// Provides:
// void sick()
//
// Seperated eat, sick, and reboot interfaces
// to comply with SRP (single responsibility principle)
// and ISP (Interface segragtion principle)
// OCP

public interface ISick {

 boolean sick();

}
