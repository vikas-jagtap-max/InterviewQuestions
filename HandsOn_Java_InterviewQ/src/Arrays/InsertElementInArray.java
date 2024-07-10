package arrays;

import java.util.Arrays;

public class InsertElementInArray {

	// Inserting Element at the beginning,
	public static int[] insertAtBeginn(int[] arr1, int value) {

		for (int i = (arr1.length - 1); i >= 0; i--) {
			arr1[i + 1] = arr1[i];
		}
		arr1[0] = value;

		return arr1;
	}

	public static void main(String[] args) {

		int arr[] = { 11, 12, 13, 14, 15 };
		int insertAtStart = 6;
		System.out.println(" " + Arrays.toString(insertAtBeginn(arr, insertAtStart)));

	}

}
