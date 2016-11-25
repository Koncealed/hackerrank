import java.util.*;

class find {
	public static long getMax(String[] input) {
		long minNum = 0;
		long response = 0;
		for(int i = 0; i < input.length;++i) { // cancel number
			response = 0;
			for(int j = 0; j < input.length;++j) { // add numbers together
				response += Integer.parseInt(input[j]);
			}
			response -= Integer.parseInt(input[i]);
			if(minNum < response) {
				minNum = response;
			}
		}
		return minNum;
	}
	public static long getMin(String[] input) {
		long response = 0;
		long minNum = 0;
		for(int i = 0; i < input.length;++i) { // cancel number
			response = 0;
			for(int j = 0; j < input.length;++j) { // add numbers together
				response += Integer.parseInt(input[j]);
			}
			response -= Integer.parseInt(input[i]);
			if(i == 0) {
				minNum = response;
			}
			if(response < minNum) {
				minNum = response;
			}
		}
		return minNum;
	}
}
public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
                String test = scan.nextLine();
		String[] testing = test.split(" ");
		System.out.println(find.getMin(testing) + " " + find.getMax(testing));
	}

}
