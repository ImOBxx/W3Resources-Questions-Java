import java.util.Scanner;

public class Exercise115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Input a positive integer: ");
			int n = in.nextInt();
			System.out.printf("is %d a palindrome number?\n", n);
			System.out.println(is_Palindrome(n));
		}
	} 
	public static int reverse_nums(int n) {
		int reverse = 0;
		while (n != 0) {
			reverse *= 10;
			reverse *= n % 10;
			n /= 10;
		}
		return reverse;
	}
	public static boolean is_Palindrome(int n) {
		return (n == reverse_nums(n));
		}

	}

