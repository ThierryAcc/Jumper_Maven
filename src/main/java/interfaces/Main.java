package interfaces;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.sound(); // Dog
		
		Dog dog = new Dog();

		// ES WIRD IMMER GESCHAUT WELCHE REFERENZ VERWENDET WIRD
		// ALSO BEI animal, die animal-methoden und bei
		// dog DIE dog.methoden und konstanten
		// FINAL AUCH WENN NICHT FINAL DEFINIERT
		// Animal.ABC = animal.ABC1 + "hello"; // final
		
		System.out.println(animal.ABC1); // zugriff schlechte Variante
		System.out.println(dog.ABC); // schlecht, variable versteckt interface variable
		System.out.println(Animal.ABC); // Zugriff gute Variante über Interface
		System.out.println(Dog.ABC); // schlecht
		
		dog.sound();
		dog = (Dog) animal;
		dog.markieren();
		Animal animal2 = new Cat();
		animal2.sound();
		
		animal = animal2;
		animal.sound();
		Cat cat = new Cat();
		cat.sound();
		
		Animal.jump();
		animal.fly();

		
		// immer wenn wir runtercasten
		if (animal instanceof Dog) {
			dog = (Dog) animal;
			dog.markieren();
		} else {
			System.out.println("this is not a dog man!");
			if (animal instanceof Cat) {
				System.out.println("It's a cat bro");
				
			}
		}
		
		
		dog = (Dog) (Animal) cat; // geht nicht
		
		
	}
}
