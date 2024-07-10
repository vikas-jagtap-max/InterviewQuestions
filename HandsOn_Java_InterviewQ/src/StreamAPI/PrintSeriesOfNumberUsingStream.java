package StreamAPI;

import java.util.stream.IntStream;

public class PrintSeriesOfNumberUsingStream {

	public static void main(String[] args) {

		// To print series of primitive integer numbers using StreamAPI ex. 1 to 10
		IntStream numbers = IntStream.range(1, 11);
		// To print
		numbers.forEach(System.out::println);
	}

}
