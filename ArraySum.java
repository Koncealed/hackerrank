import java.util.*;
                            /*    https://www.hackerrank.com/challenges/simple-array-sum        */
public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
    input.nextLine(); // HAS TO GET RID OF \N
		String nums = input.nextLine();
		String[] numbers = nums.split(" ");
		input.close();
		int result = 0;
		for(int i = 0; i < amount; ++i){
			int temp = Integer.parseInt(numbers[i]);
			result += temp;
		}
		System.out.println(result);
	}
}
