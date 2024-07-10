package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Operation {

	public static void main(String[] args) {

		// List<Integer> salaries = new ArrayList<Integer>();
		List<Integer> salaries = Arrays.asList(12000, 56000, 10000, 56000, 13000);

		Integer largestSalary = salaries.stream().distinct() //
				.sorted((a, b) -> Integer.compare(b, a)) //
				.findFirst() //
				.orElse(null); //
		System.out.println("Largest/Maximum Salary is: " + largestSalary);

		Integer secondLargestSalary = salaries.stream().distinct() //
				.sorted((a, b) -> Integer.compare(b, a)) //
				.skip(1) //
				.findFirst() //
				.orElse(null); //

		System.out.println("Second Largest Salary is: " + secondLargestSalary);

		Integer minimumSalary = salaries.stream().distinct() //
				.sorted() //
				.findFirst() //
				.orElse(null); //

		System.out.println("Minimum Salary is: " + minimumSalary);

	}
}
