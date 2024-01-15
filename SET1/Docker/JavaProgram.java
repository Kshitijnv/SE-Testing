
public class JavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num1 = 15;
	        int num2 = 8;
	        int num3 = 20;

	        // Calculate the sum of the largest number
	        int large = Largest(num1, num2, num3);
	        int sum=sumOfThreeNumbers(num1, num2, num3);

	        // Display the result
	        System.out.println("the largest number: " + large);
	        System.out.println("the sum of three numbers: " + sum);

	}
	 private static int Largest(int a, int b, int c) {
	        // Using Math.max to find the largest number
	        int largest = Math.max(a, Math.max(b, c));

	        // Returning the sum of the largest number
	        return largest;
	    }
	 private static int sumOfThreeNumbers(int a,int b,int c)
	 {
		 return a+b+c;
	 }

}


