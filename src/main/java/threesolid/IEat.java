package threesolid;

// IEat.java
//
// An Interface
//
// Provides:
// void eat()
//
// Seperated eat, sick, and reboot interfaces
// to comply with SRP (single responsibility principle)
// and ISP (Interface segragtion principle)
// OCP

public interface IEat {

  boolean eat();

}
