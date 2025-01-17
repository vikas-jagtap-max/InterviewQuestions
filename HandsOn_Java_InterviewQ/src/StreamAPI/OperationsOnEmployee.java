package StreamAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OperationsOnEmployee {

	public static void main(String[] args) {

		// List of employee with its respective details
		List<Employee> employees = Arrays.asList(
				new Employee(1, "John", 50500.0, "Developer", 26, LocalDate.of(2018, 10, 15), "Male", "HR"),
				new Employee(2, "Jane", 65000.500, "Manager", 35, LocalDate.of(2015, 05, 10), "Male", "IT"),
				new Employee(3, "Riya", 70000.300, "Senior Developer", 36, LocalDate.of(2012, 12, 01), "Female",
						"Finance"),
				new Employee(4, "Priya", 82000.300, "Technology Lead", 37, LocalDate.of(2012, 11, 03), "Female",
						"Sales"));

		// 1)Average Salary of employee
		Double avgSalary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		//
		System.out.println("The average salary is: " + avgSalary);

		// 2) Employee who has largest salary
		Optional<Employee> highestPaidEmployee = employees.stream()
				.max(Comparator.comparingDouble(Employee::getSalary));
		// OR
		// Optional<Employee> highestPaidEmployee = employees.stream().max((e1, e2) ->
		// Double.compare(e1.getSalary(), e2.getSalary()));
		System.out.println("Employee who has largest/maximum salary is: " + highestPaidEmployee.get());

		// 3)Employee who has second largest salary
		Employee secondhighestPaidEmployee = employees.stream().distinct()
				.sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).skip(1).findFirst().orElse(null);
		System.out.println("Employee who has second largest salary is: " + secondhighestPaidEmployee.toString());

		// 4)Employee who has minimum salary
		Optional<Employee> lowestPaidEmployee = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
		// OR
		// Optional<Employee> lowestPaidEmployee = employees.stream().min((e1, e2) ->
		// Double.compare(e1.getSalary(), e2.getSalary()));
		System.out.println("Employee who has minimum salary is: " + lowestPaidEmployee.get());

		// 5)Employee who joined the organization in a specific year
		int specificYear = 2012; // specify the year to filter employee
		List<Employee> filteredEmplyoyee = employees.stream().filter(e -> e.getDOJ().getYear() == specificYear)
				.collect(Collectors.toList());
		System.out.println("Employee who joined in " + specificYear + " : ");
		filteredEmplyoyee.forEach(System.out::println);

		// 6)Number of employees in each department
		Map<String, Long> countPerDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		countPerDepartment.forEach((department, count) -> System.out.println(department + " : " + count));

		// 7)Number of Male and Female employeesF
		Map<String, Long> countPerGender = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		countPerGender.forEach((gender, count) -> System.out.println(gender + " : " + count));

		// 8)Youngest employee in the organization
		Optional<Employee> youngestEmplyoyee = employees.stream().min(Comparator.comparingInt(Employee::getAge)); // int
																													// and
																													// Integer
																													// are
																													// got
																													// compared
		System.out.println("Youngest employee is: " + youngestEmplyoyee.get());

		// 9)Increment employee salary in HR department by 10%
		employees.stream().filter(emp -> "HR".equals(emp.getDepartment()))
				.forEach(emp -> emp.setSalary(emp.getSalary() * 1.10));

		// Cross confirm
		employees.forEach(emp -> System.out.println(emp)); // Printing using Lambda Expression
		// employees.forEach(System.out::println); // Printing using Method reference
	}

}
