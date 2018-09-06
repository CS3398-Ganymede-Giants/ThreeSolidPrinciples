package threesolid; 
// Worker.java
// Provides: 
//    public class Worker
// Implements:
//	  IWorkable work()
//	  IFeedable eat()
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, 
//   but closed for modification
// Interface Segregation (ISP) -- This class implements IWorkable and IFeedable 
//	for Workers. 
// Single Responsibility (SRP) -- This class is only responsible for Workers. 
//		
public class Worker implements IWorkable,IFeedable{
		public void work() {
			//....working
			
		}
		public void eat() {
			//....eating 
			
		}
}