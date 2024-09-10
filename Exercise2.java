import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in)) {
			System.out.println("Input a value for inch: ");
			double inch = Input.nextDouble();
			double meters = inch * 0.0254;
			System.out.println(inch + " inch is " + meters + " meters");
		}
		

	}

}
