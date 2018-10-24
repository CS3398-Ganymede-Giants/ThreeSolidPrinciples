//IReboot.java
//
// An interface
//
// Provides:
//reboot() method
//
// Seperated eat, sick, and reboot interfaces
// to comply with SRP (single responsibility principle)
// and ISP (Interface segragtion principle)
// OCP

package threesolid;

public interface IReboot{
    boolean reboot();
}
