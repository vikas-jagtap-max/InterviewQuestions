package topic.ObjectCloning.DeepCopy;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Pune", "Maharashtra", "India");
		Person person1 = new Person("Vikas", address);

		// Deep Copy - A deep copy involves creating a new instance of an object and
		// recursively copying all objects that are referenced by the original object.
		Person person2 = (Person) person1.clone();
		System.out.println("Original Object: " + person1);
		System.out.println("Cloned Object: " + person2);

		// Modifying the clone's name to show that the original and clone are separate
		// objects
		person2.name = "Neha";

		// As you can see name of original object remained unchanged
		System.out.println(person1.name);
		System.out.println(person2.name);

		// Modifying the clone's address to show that the original and clone are
		// separate objects
		person2.address.city = "Mumbai";

		// As you can see address of original object remained unchanged
		System.out.println(person1.address);
		System.out.println(person2.address);
	}

}
