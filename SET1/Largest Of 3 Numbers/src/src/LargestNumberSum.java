package src;

public class LargestNumberSum {
	public static void main(String[] args) {
		// Initialize three integers
		int num1 = 25;
		int num2 = 10;
		int num3 = 35;

		// Find the largest number among the three
		int largest = findLargest(num1, num2, num3);

		// Display the result
		System.out.println("The largest number is: " + largest);
	}

	// Method to find the largest number among three integers
	public static int findLargest(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}
}
