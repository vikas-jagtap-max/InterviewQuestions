package topic.basic.program;

//Reverse a 32-bit Signed Integer
public class ReverseAnInteger {

	public static void main(String[] args) {

		int num = -122;
		int reverseInteger = reverse(num);
		System.out.println("Reverse Integer number is: " + reverseInteger);

	}

	private static int reverse(int num) {
		int Lastdigit = 0;
		int reverse = 0;

		while (num != 0) {
			Lastdigit = num % 10; // logic
			reverse = reverse * 10 + Lastdigit;
			num = num / 10; // Logic
		}
		return reverse;
	}

}
