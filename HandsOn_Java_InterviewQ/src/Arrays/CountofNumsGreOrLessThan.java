package arrays;

import java.util.Scanner;

public class CountofNumsGreOrLessThan {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 6, 22, 45, 67, 8, 20 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number above & below which you need count of numbers present in the array: ");
		int limit = sc.nextInt();

		int countOfNumLessThanLimit = 0;
		int countOfNumGreatThanLimit = 0;

		for (int num : arr) {
			if (num < limit) {
				countOfNumLessThanLimit++;

			} else {
				countOfNumGreatThanLimit++;
			}
		}

		System.out.println("Number of elements present in an array which are less than " + limit + " are: "
				+ countOfNumLessThanLimit);
		System.out.println("Number of elements present in an array which are greater than " + limit + " are: "
				+ countOfNumGreatThanLimit);

	}

}
