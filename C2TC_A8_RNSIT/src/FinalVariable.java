
public class FinalVariable {
	// Declare a blank final instance variable.
	final int x=10;
// Declare a static blank final variable. 
	final static int a;

	void FinalVar() {
		//can't reassign final variable
		a=80;
		x = 30;
		final int y=80;
	}

	void displayValue() {
		System.out.println("Value of x: " + x);
	}

// Declare a static block to initialize the final static variable. 
	static {
		a = 20;
		System.out.println("Value of a: " + a);
	}
}