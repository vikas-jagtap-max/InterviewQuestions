package topic.basic.program;

public class EvenOdd {

	public static void main(String[] args) {

		// Approach 1:
		int num = 14;

		//
		if ((num % 2) == 0) {
			System.out.println("Given Number is Even");
		} else {
			System.out.println("Given Number is Odd");

		}

		// Approach 2: Using Bitwise AND operator instead of using any of the
		// mathematical operation.

		int number = 15;

		//
		if ((number & 1) == 0) {
			System.out.println("Given Number is Even");
		} else {
			System.out.println("Given Number is Odd");

		}
	}

}
