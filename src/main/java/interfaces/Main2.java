package interfaces;

public class Main2 {
	public static void main(String[] args) {
		Animal a1 = new Dog();		
		Dog dog = new Dog();
		
		// statische Methode
		Animal.jump();
		a1.fly();
		dog.fly();
		a1.sound();
		dog.sound();

		
		System.out.println(Dog.ABC); // good, from Dog
		System.out.println(Dog.ABC2); // bad, from Animal
		
		Dog.thestaticdog();
	}
}
