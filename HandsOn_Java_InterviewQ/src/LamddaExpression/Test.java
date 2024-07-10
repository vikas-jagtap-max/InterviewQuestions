package LamddaExpression;

public class Test {

	public static void main(String[] args) {

		// Implementation of Functional Interface ex. Summation
		Summation sumOfTwoNumbers = (a, b) -> System.out.println(a + b);

		// Calling
		sumOfTwoNumbers.sum(4, 7);
	}

}
