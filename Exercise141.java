import java.util.Arrays;

public class Exercise141 {


		static boolean is_Unique_str(String str) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			for (int i = 1; i < chars.length; ++i) {
			    if (chars[i] == chars[i - 1]) {
			    	return false;
			    }
			} 
			return true;
		}
		public static void main1(String[] args) {
			String str = "xyyz";
			System.out.println("Original String : " + str);
			System.out.println("String has all unique characters: " + is_Unique_str(str));
		}
	}
			    
			
			
		

	


