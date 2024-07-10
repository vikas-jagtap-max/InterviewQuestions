package topic.Java8Features.MethodReferences;

public class Test {

	public static void main(String[] args) {

		// 1)Referring static method
		Sayable1 sayable1 = Implementation::say;
		sayable1.say(); // Calling interface method

		// 2)Reference to an Instance Method
		Implementation imp = new Implementation();
		Sayable2 sayable2 = imp::saySomething;
		sayable2.saySomething();// Calling interface method

		// 3)Reference to a Constructor
		Sayable3 sayable3 = Implementation::new;
		sayable3.sayAnything("hello");

	}

}
