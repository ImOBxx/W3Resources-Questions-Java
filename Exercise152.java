import java.util.Scanner;

public class Exercise152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input first numbers: ");
		int num1 = in.nextInt();
		System.out.println("Input second number: ");
		int num2 = in.nextInt();
		System.out.println("Input the third number: ");
		int num3 = in.nextInt();
		System.out.println("Input the fourth number: ");
		int num4 = in.nextInt();
		if (num1 == num2 && num2 == num3 && num3 == num4) {
			System.out.println("Numbers are equal.");
		} else {
			System.out.println("Numbers are not equal!");
		}
		
		
		

	}

}
