
public class Exercise147 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bitSwapRequired(27, 23));
	}
	public static int bitSwapRequired(int x, int y) {
		int ctr = 0;
		for (int z = x ^ y; z != 0; z = z >>> 1) {
			ctr += z & 1;
		}
		return ctr;
	}
}
	
