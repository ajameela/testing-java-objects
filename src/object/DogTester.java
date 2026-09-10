/*
 * Jameela Ahmed
 * 9.8.26
 * Dog Object Class
 * With constructors, setters and getters, and toString()
 */

package object;

public class DogTester {

	public static void main(String[] args) {
		// Testing a Dog Object
		Dog dog1 = new Dog();
		dog1.setName("Midnight");
		dog1.setBreed("German Shepherd");
		dog1.setAge(3);

		System.out.println("Default values for the dog1 fields");
		System.out.println(dog1.toString());
		System.out.println(dog1.getName());
		System.out.println(dog1.getAge());
		System.out.println(dog1.getBreed());

		// Dog #2
		Dog dog2 = new Dog("Nova", 9, "Chihuahua mix");
		System.out.println(dog2);

		System.out.println("Non-Default values for the dog2 fields");
		System.out.println(dog2.toString());
		System.out.println(dog2.getName());
		System.out.println(dog2.getAge());
		System.out.println(dog2.getBreed());

	} // end main

} // end class
