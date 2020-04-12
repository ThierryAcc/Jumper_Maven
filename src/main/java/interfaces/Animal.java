package interfaces;

public interface Animal {
	
	// immer diese form
	static final String ABC = "ABC1";
	
	// die anderen sind genau gleich wie das obere in einem interface
	static String ABC1 = "ABC1";
	final static String ABC2 = "ABC1";
	String ABC3 = "ABC1";
	
	
	public void sound(); // ist auch public nicht default
		
	// utility function
	public static void jump() {
		System.out.println("Static jumper - called with Animal.");
	}
	
	// object function
	// can still be overwritten
	default void fly() {
		System.out.println("Default flyer - called with Object or Animal");
	}
}
