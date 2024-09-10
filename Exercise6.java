import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input weight in pounds: ");
		double weight = input.nextDouble();
		System.out.println("Input height in inches: ");
		double inches = input.nextDouble();
		double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
		System.out.print("Body mass Index is " + BMI + "\n");

	}

}
