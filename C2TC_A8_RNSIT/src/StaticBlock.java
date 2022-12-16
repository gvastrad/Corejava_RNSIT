
public class StaticBlock {
	 static int a = 20; 
	 int b = 30; // Instance variable 
	// Declare instance method. 
	  void display()
	  { 
	    System.out.println("Hello Java"); 
	  } 
	static void show()
	{ 
	   System.out.println("You cannot access instance variable in static method "); 
	  // System.out.println(b); // Compile time error because cannot make a static reference to the non-static field b. 
	 } 
	// Declare instance block. 
	   { 
		   System.out.println("In inner block");
	    display(); // Calling instance method. 
	   }
	   static 
	   { 
	     // display(); // Compile time error because we cannot call instance method in static area. 
	     System.out.println("In static block");
		   System.out.println(a); // Calling static method.
	     // System.out.println(" " +b); // Compile time error because we cannot call instance variable in static block. 
	    }
}
