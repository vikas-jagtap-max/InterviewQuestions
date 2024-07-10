package paranthesisBalancedOrNot;

import java.util.Stack; //

//Each Parenthesis should be properly closed in a correct order.
public class Paran {

	public static String checkBalanceOrNot(String data) {

		char[] charArray = data.toCharArray();

		Stack<Character> stack = new Stack<>();

		for (char c : charArray) {

			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);

			} else { // To cover negative scenario, if the stack becomes empty or doesn't have
						// opening parenthesis.
				if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
					return "NO";

				}
			}

		}
		return stack.isEmpty() ? "YES" : "NO";

	}

	public static boolean isMatchingPair(char open, char close) {

		return (open == '{' && close == '}') || (open == '(' && close == ')') || (open == '[' && close == ']');
	}

	public static void main(String[] args) {

		String s = "{([])}";

		System.out.println("Is Paranthesis Balanced: " + checkBalanceOrNot(s));
	}

}
