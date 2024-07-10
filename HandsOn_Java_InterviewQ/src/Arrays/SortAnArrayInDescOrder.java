package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAnArrayInDescOrder {

	public static void main(String[] args) {

		// Ways
		// 1)Using Arrays.sort()
		Integer arr1[] = { 1, 2, 3, 4, 5 };
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr1));

		// 2)Using Lambda Expression
		Integer arr2[] = { 1, 2, 3, 4, 5 };
		Arrays.sort(arr2, (a, b) -> b - a);
		System.out.println(Arrays.toString(arr2));

		// 3)Using Arrays.sort() with Stream API
		Integer arr3[] = { 1, 2, 3, 4, 5 };
		Integer[] sortedArray = Arrays.stream(arr3).sorted((a, b) -> b - a).toArray(Integer[]::new);
		System.out.println(Arrays.toString(sortedArray));

		// 4)Using Collections.sort()
		Integer arr4[] = { 1, 2, 3, 4, 5 };
		List<Integer> arrayList = Arrays.asList(arr3);
		Collections.sort(arrayList, Collections.reverseOrder());
		Integer array[] = arrayList.toArray(new Integer[0]);
		System.out.println(Arrays.toString(array));

	}

}
