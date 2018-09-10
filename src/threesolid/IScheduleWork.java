package threesolid;

// IScheduleWork.java
//
// An Interface
//
// Provides:
// void schedulework()
//
// Seperates schedulework and defineproduct interfaces
// to comply with SRP (single responsibility principle)
// and ISP (Interface segragtion principle)
// OCP

interface IScheduleWork {

	// provides an interface for schedulework
	void schedulework();

}
