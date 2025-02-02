import java.util.Scanner;

public class Exercise164 {
	
	public static float divide_using_subtraction(int dividend, int divider) {
		if (divider == 0) {
			return 0;
		}
		float result = 0;
		while (dividend > divider) {
			dividend -= divider;
			result++;
		}
		float decimalPart = (float) dividend / (float) divider;
		result += decimalPart;
		return result;
	}
	
		public static void main(String[] args) {
	
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Input the dividend: ");
			int dividend = in.nextInt();
			System.out.println("Input the divider: ");
			int divider = in.nextInt();
			System.out.println("\nResult: " + divide_using_subtraction(dividend, divider));
		}
		}
}

	
