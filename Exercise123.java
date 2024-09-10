import java.util.ArrayList;

public class Exercise123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList nums = new ArrayList();
        nums.add(-2);
        nums.add(1);
        nums.add(-3);
        nums.add(4);
        System.out.print(min_SubArray(nums));
	}
	public static int min_SubArray(ArrayList nums) {
		int[] nums1 = new int[nums.size()];
		nums1[0] = (int) nums.get(0);
		int min = nums1[0];
		for (int i = 1; i < nums.size(); ++i) {
			nums1[i] = Math.min(nums.get(i), nums.get(i) + nums1[i - 1]);
			min = Math.min(min, nums1[i]);
		}
		return min;
	}
		}
        
	

