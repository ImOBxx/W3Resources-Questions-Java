import java.util.Arrays;

public class Exercise179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3};
		System.out.println("Original array: " + Arrays.toString(nums));
		System.out.println("Size of longest increasing continous sunsequence: " + longest_seq(nums));
		

	}

	private static int longest_seq(int[] nums) {
		// TODO Auto-generated method stub
		int max_sequ = 0;
		if (nums.length == 1)
			return 1;
		for (int i = 0; i < nums.length - 1; i++) {
			
		}
		return max_sequ;
		
		
		
	}

}
