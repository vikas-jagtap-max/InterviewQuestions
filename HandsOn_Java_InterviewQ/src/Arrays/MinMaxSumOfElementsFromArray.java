package arrays;

import java.util.Arrays;

public class MinMaxSumOfElementsFromArray {

	public static void main(String[] args) {

		int arr[] = { 5, 8, 15, 3, 1, 59 };

		// Using Stream API
		int minimumElement = Arrays.stream(arr).min().getAsInt();
		System.out.println("Minimum Element from an Array is: " + minimumElement);

		int maximumElement = Arrays.stream(arr).max().getAsInt();
		System.out.println("Maximum Element from an Array is: " + maximumElement);

		int sumOfElements = Arrays.stream(arr).sum();
		System.out.println("Sum of Elements of an Array is: " + sumOfElements);
	}

}
