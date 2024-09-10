import java.util.Scanner;

public class Exercise163 {

          public static int countBitsTozeroBasedOnString(int n) {
        	  int ctr = 0;
        	  String binaryNumber = Integer.toBinaryString(n);
        	  System.out.print("Binary reprsentation of " + n + " is: " + binaryNumber);
        	  for(char ch : binaryNumber.toCharArray()) {
        		  ctr += ch == '0' ? 1 : 0;
        	  }
        	  return ctr;
          }
          public static void main(String[] args) {
        	  try (Scanner in = new Scanner(System.in)) {
				System.out.print("Input first number: ");
				  int n = in.nextInt();
				  System.out.println("\nNumber of zero bits: " + countBitsTozeroBasedOnString(n));
			}
        	  
          
		

	}

}
