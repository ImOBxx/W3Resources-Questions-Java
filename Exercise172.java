import java.util.ArrayList;
import java.util.Arrays;

public class Exercise172 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] main_arra = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] query_arra = {1, 4, 8};
		ArrayList<Integer> result = count_smaller_number(main_arra, query_arra);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	public static ArrayList<Integer> count_smaller_number(int[] main_arra, int[] query_arra) {
		ArrayList<Integer> result = new ArrayList<>();
		Arrays.sort(main_arra);
		for (int i = 0; i < query_arra.length; i++) {
			result.add(temp(main_arra, query_arra[i]));
		}
		return result;
	}
	private static int temp(int[] main_arra, int num) {
		int i;
		if (main_arra[i] < num) {
			int ctr;
			ctr++;
		} else {
			break;
		}
	}


	return ctr;
	
		}
		

	}


