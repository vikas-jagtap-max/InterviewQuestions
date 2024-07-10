package topic.basic.program;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		// 1)Using temporary variable
		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("a is: " + a + " and " + "a is: " + b);

		// 2)Using mathematical operations such as +, - , *, /

		int a1 = 90;
		int b1 = 100;

		a1 = a1 + b1;
		b1 = a1 - b1;
		a1 = a1 - b1;

		System.out.println("a1 is: " + a1 + " and " + "b1 is: " + b1);

		// 3)Using Bitwise Manipulation - EXOR bitwise operator

		int a2 = 10;
		int b2 = 20;
		a2 = a2 ^ b2;
		b2 = a2 ^ b2;
		a2 = a2 ^ b2;

		System.out.println("a2 is: " + a2 + " and " + "b2 is: " + b2);
	}

}
