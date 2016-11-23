import java.util.*;

class find {
	public static int getMax(String[] input) {
		int minNum = 0;
		int response = 0;
		for(int i = 0; i < input.length;++i) { // cancel number
			response = 0;
			for(int j = 0; j < input.length;++j) { // add numbers together
				response += Integer.parseInt(input[j]);
			}
			response -= Integer.parseInt(input[i]);
			if(minNum > response) {
				minNum = response;
			}
		}
		return minNum;
	}
	public static int getMin(String[] input) {
		int minNum = 0;
		int response = 0;
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
}
public class Solution {

	public static void main(String[] args) {
		String test = "1 2 3 4 5";
		String[] testing = test.split(" ");
		find.getMin(testing);
	}

}
