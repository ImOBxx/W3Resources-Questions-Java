import java.util.Arrays;
import java.util.Collections;

public class Exercise160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = new Integer[] {1, 4, 17, 7, 25, 3, 100};
		int k = 2;
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("K'th smallest element of the said array: ");
		Arrays.sort(arr);
		System.out.println(arr[k -1] + " ");
		System.out.println("\nK'th largest element of the said array: ");
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.print(arr[k-1] + " ");
	}

}
