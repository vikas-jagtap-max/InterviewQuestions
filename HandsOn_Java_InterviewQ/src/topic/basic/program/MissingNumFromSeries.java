package topic.basic.program;

import java.util.Arrays;

public class MissingNumFromSeries {

	public static void main(String[] args) {

		int arr[] = { 3, 0, 1 };

		int n = arr.length;
		int currentSumOfNumOfSeries = Arrays.stream(arr).sum();

		// If series ranges from 0 to N,
		int expectedSumOfNumOfSeries = n * (n + 1) / 2;

		int missingNumber = expectedSumOfNumOfSeries - currentSumOfNumOfSeries;

		System.out.println("Missing Number from a series is: " + missingNumber);

	}

}
