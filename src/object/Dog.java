/*
 * Jameela Ahmed
 * 9.8.26
 * Dog Object Class
 */

package object;

public class Dog {

	// Data variables
	private String name;
	private int age;
	private String breed;

	public Dog() {
		this.name = "Pluto";
		this.age = 1;
		this.breed = "Mixed";
	} // end constructor

	public Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	} // end constructor

	// Setters and Getters

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setAge(int age) {
		if (age >= 0)
			this.age = age;
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	// Overriding the toString() method

	@Override
	public String toString() {
		return "Dog{name = " + name + " age = " + age + " breed = " + breed + "}";
	}// end toString()

} // end class
