import java.util.Arrays;

public class Exercise162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer nums[] = new Integer[] {1, 4, 17, 7, 25, 3, 100};
		int sum = 0;
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(nums));
		for(int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		double average = sum / nums.length;
		System.out.println("The average of the said array is: " + average);
		System.out.println("the numbers in the said array that are greater than the average: ");
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > average) {
				System.out.println(nums[i]);
			}
		}

	}

}
