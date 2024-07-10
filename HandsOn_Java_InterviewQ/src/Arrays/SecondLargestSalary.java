package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestSalary {

	public static void main(String[] args) {

		int[] salaries = { 50000, 50000, 67000, 35000, 70000 };

		// A)Using Stream API
		// 1) Convert an array into stream
		// 2) remove duplicate elements

		// 3)convert stream of primitive values into stream of integer object because
		// upcoming sort operation needs stream of integer objects not stream of a
		// primitive values.
		// 4)Sorted the stream of integer objects in the descending order
		// 5)Skipped first element as we want second element.
		// 6)Find the first element which is now the second largest salary & get it.
		Integer SecLargestSal = Arrays.stream(salaries).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();

		System.out.println("Second largest salary from an array is: " + SecLargestSal);

		// B)Using one pass approach
		// code complexity is 0(n) as we iterate over an array at least once
		int largest = 0;
		int secondLargest = 0;

		for (int currentSalary : salaries) {
			if (currentSalary > largest) {
				// replace secondLargest with largest
				secondLargest = largest;
				// And put currentSalary as largest
				largest = currentSalary;

			} else if (currentSalary > secondLargest && currentSalary != largest) {
				// just replace secondLargest with currentSalary
				secondLargest = currentSalary;
			}

		}

		System.out.println("Second largest salary from an array is: " + secondLargest);

	}

}
