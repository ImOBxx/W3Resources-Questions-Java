import java.util.Scanner;
public class Exercise12 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in)) {
			System.out.println("Input the first number: ");
			int n1 = scanner.nextInt();
			System.out.println("Input the second number");
			int n2 = scanner.nextInt();
			int sum = n1 + n2;
			int minus = n1 -n2;
			int multiply = n1 * n2;
			int substract = n1 + n2;
			int divide = n1 / n2;
			int rnums = n1 % n2;
			System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubstract = %d\ndivide = %d\nRemainderof2Numbers = %d/n", sum, minus, multiply,substract, divide, rnums);
		}
		
		
		

	}

}
