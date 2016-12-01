import java.util.Arrays;
import java.util.Scanner;

class rotate {
	public static int[] left(String input, int rotateAmount, int size) {
		int[] rotated = new int[size];
		String[] temp = input.split(" ");
		for(int i = 0; i < size;++i) { // Control the number placement we are on.
			int count = i; //Reps where it will be placed.
			for(int j = 0; j < rotateAmount;++j) { // Control the count on where the number will be placed.
				--count; // moving downwards or to left
				if(count == -1) { // if the array goes less than 0 it moves it back to the top
					count = size - 1;
				}
			}
			rotated[count] = Integer.parseInt(temp[i]);
		}
		return rotated;
	}
}

public class Solution {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int rotations = scan.nextInt();
        scan.nextLine();
        String nums = scan.nextLine();
        System.out.println(Arrays.toString(rotate.left(nums, rotations, size)).replace("[", "")
        		                                                              .replace(",", "")
        		                                                              .replace("]", ""));
	}
}
