// BaseWorker class
//
// Data: public void work();
//
// Description: Has its own work method and this class
// is reachable to all other classes to be the only
// extended class for this program
//
// OCP - closed for modicfications, open for extension
// SRP - only responsible for basic duty for all workers (work method)
// ISP - interfaces not associated with this class
//
//

package threesolid;

public class BaseWorker {
	
	public void work() {
		
	    System.out.format("In BaseWorker work method ... \n"); 
	}
	
}
