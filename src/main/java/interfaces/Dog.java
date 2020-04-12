package interfaces;

public class Dog implements Animal {
	public static final String ABC = "HUND " + Animal.ABC; // schlecht

	@Override
	public void sound() {
		System.out.println("WUFF");
	}
	
	public void markieren() {
		System.out.println("I marked this place!");
	}
	
	@Override
	public void fly() {
		//Animal.super.fly();
		System.out.println("But I can not fly. I am a dog.");
	}
	
	
	
	public static void thestaticdog() {
		System.out.println("thestaticdog");
	}
}
