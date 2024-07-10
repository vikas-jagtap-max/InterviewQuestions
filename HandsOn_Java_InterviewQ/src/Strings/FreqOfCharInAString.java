package Strings;

import java.util.LinkedHashMap;
import java.util.Map; //

public class FreqOfCharInAString {

	public static void main(String[] args) {
		String data = "Stress";
		data = data.toLowerCase();
		char[] arr = data.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>(); // LinkedHash Map will maintain order.

		for (char c : arr) {
			if (Character.isLetter(c)) {

				map.put(c, map.getOrDefault(c, 0) + 1);

			}

		}

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
	}

}
