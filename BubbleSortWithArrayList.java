import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> sortMe = new ArrayList<Integer>();
		int size = scan.nextInt();
		scan.nextLine();
		String[] input = scan.nextLine().split(" ");
		for(int i = 0; i < size;++i) {
			sortMe.add(Integer.parseInt(input[i]));
		}
		int numSwapHold = 0;
		for(int i = 0; i < sortMe.size() - 1;++i){
			int numSwaps = 0;
			for(int j = 0; j < sortMe.size() - 1;++j) {
				if(sortMe.get(j) > sortMe.get(j + 1)) {
					int temp = sortMe.get(j);
					sortMe.set(j, sortMe.get(j + 1));
					sortMe.set(j + 1, temp);
					++numSwaps;
				}
			}
			numSwapHold += numSwaps;
			if(numSwaps == 0) {
				break;
			}
		}
		System.out.println("Array is sorted in " + numSwapHold  + " swaps.");
		System.out.println("First Element: " + sortMe.get(0));
		System.out.println("Last Element: " + sortMe.get(sortMe.size() - 1));
	}

}
