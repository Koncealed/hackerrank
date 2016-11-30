import java.util.Scanner;

class rotate {
	public static int[] left(String input, int rotateAmount, int size) {
		int[] rotated = new int[size];
		int[] temp1 = new int[size];
		String[] temp = input.split(" ");
		for(int i = 0; i < size;++i) {
			for(int j = 0; j < size;++j) {
				temp1[i] = Integer.parseInt(temp[i]);
			}
		}
		for(int i = 0; i < size;++i) { // Control the number placement we are on.
			int count = i; //Reps where it will be placed.
			for(int j = 0; j < rotateAmount;++j) { // Control the count on where the number will be placed.
				--count; // moving downwards or to left
				if(count == -1) { // if the array goes less than 0 it moves it back to the top
					count = size - 1;
				}
			}
			rotated[count] = temp1[i];
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
		for(int i = 0; i < size;++i){
			System.out.print(rotate.left(nums, rotations, size)[i] + " ");
		}
	}
}
