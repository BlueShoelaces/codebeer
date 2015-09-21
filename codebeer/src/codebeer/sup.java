package codebeer;

public class sup {

	public static void main(final String[] args) {
		System.out.println("Sup.");
	}

	public static int power(final int base, final int power) {
		int product = 1;
		for (int timesMultiplied = 0; timesMultiplied < power; timesMultiplied++) {
			product *= base;
		}
		return product;
	}

}
