import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.print("Input 1st integer: ");
			int firstInt = in.nextInt();
			System.out.print("Input 2nd integer: ");
			int secondInt = in.nextInt();
			System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
			System.out.printf("Differnce of two integers: %d%n", firstInt - secondInt);
			System.out.printf("Product of two integrs: %d%n", firstInt * secondInt);
			System.out.printf("Average of two integers: %2f%n", (double) (firstInt + secondInt) / 2);
			System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
			System.out.printf("Max integers: %d%n", Math.max(firstInt, secondInt));
			System.out.printf("Min Integer: %d%n", Math.min(firstInt, secondInt));
		}

	}

}
