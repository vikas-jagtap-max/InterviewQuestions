package palindrome;

import java.util.Scanner;

//Q. Print all the palindrome numbers within the given range
public class PalindromeFrom1toN {

	public static void main(String[] args) {

		// step 1:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int lowerLimit = sc.nextInt(); // 10
		int upperLimit = sc.nextInt(); // 100

		// step 2:
		System.out.println("All Palindrome numbers from " + lowerLimit + " to " + upperLimit + " are: ");
		for (int i = lowerLimit; i <= upperLimit; i++) {

			int num = i;
			int reverse = 0;

			while (num > 0) {
				int Lastdigit = num % 10; // last digit
				reverse = (reverse * 10) + Lastdigit;
				num = num / 10;
			}

			// step 3:
			if (reverse == i) {
				System.out.println(i + " ");

			}

		}

	}

}
