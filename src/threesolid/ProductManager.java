package threesolid;

// ProductManager.java
// Provides:
//     public class ProductManager
// Extends:
//		 public class Manager
// Implements:
//		 IDefineProduct defineproduct()
//
// SOLID Principles:
// Open/Close Principle (OCP) -- This class is open for extension, but
//     closed for modification.
// Single Responsibility (SRP) -- This class has a single responsibility
//    for ProductManagers.
// Interface Segregation (ISP) -- This class implements schedulework for
// 		ProductManager

public class ProductManager extends Manager implements IDefineProduct {

	public void defineproduct() {
		// defineproduct function for ProductManager
		System.out.format("ProductManager defineproduct() ... \n");
	}

}
