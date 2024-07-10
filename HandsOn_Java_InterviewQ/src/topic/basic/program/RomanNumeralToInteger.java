package topic.basic.program;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralToInteger {

	public static void main(String[] args) {

		// String input = "IV";
		String input = "VII";

		int preValue = 0;
		int result = 0;

		Map<Character, Integer> romanVal = new HashMap<>();
		romanVal.put('I', 1);
		romanVal.put('V', 5);
		romanVal.put('X', 10);
		romanVal.put('L', 50);

		for (int i = input.length() - 1; i >= 0; i--) {

			int currentVal = romanVal.get(input.charAt(i));
			if (currentVal < preValue) {
				result = result - currentVal;

			} else {
				result = result + currentVal;
			}
			preValue = currentVal;
		}
		System.out.println("Roman number to Integer is: " + result);
	}

}
