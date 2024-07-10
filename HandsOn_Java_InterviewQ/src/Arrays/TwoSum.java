package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	// Time Complexity of HashMap is O(n)

	public static int[] twoSum(int[] num, int expSumOfTwoNums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {
			int diffValue = expSumOfTwoNums - num[i];

			if (map.containsKey(diffValue)) {
				// If we found the required number in HashMap then we will take its index and
				// index of current element & print it
				int[] outputArray = { map.get(diffValue), i };
				return outputArray;
			}

			map.put(i, num[i]);

		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(
				"Indexes of elements whose sum is " + target + " are: " + Arrays.toString(twoSum(nums, target)));

	}
}
