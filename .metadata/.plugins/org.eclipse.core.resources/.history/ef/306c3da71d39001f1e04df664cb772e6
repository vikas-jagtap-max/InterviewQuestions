package topic.MarkerInterface.Cloneable;

//Implement the Cloneable interface.
//The clone() method in the Object class is protected and throws CloneNotSupportedException when called as the Object class does not implement the Cloneable interface. By overriding clone() and implementing Cloneable interface in custom class, this exception is avoided.
//When a class implements the Cloneable interface, it signals to the Object.clone() method that it is legal to make a field-for-field copy of instances of that class.

public class Person implements Cloneable {

	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// The clone() method in Object Class is protected, which means it is not
	// accessible from outside unless overridden to be public. Hence we cannot clone
	// object of custom class directly enough though it defaultly extends Object
	// class. The clone() method of Object Class is overridden in custom class to
	// make it public in order to call it from outside in order to call it from
	// outside.
	@Override
	public Object clone() throws CloneNotSupportedException {
		// Call clone() method of Object Class (super.clone()) within the overridden
		// clone() method to create the clone of custom class. The super.clone() method
		// performs the actual cloning operation, creating a shallow copy of the object.
		return super.clone();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
