import java.util.Scanner;

class compare {
	public static int[] grades(int[] grades1,int[] grades2) {
		int[] count = new int[2];
		for(int i = 0; i < 3;++i) {
			if(grades1[i] > grades2[i]) {
				++count[0];
			} else if(grades1[i] < grades2[i]) {
				++count[1];
			}
		}
		return count;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
		String temp1 = scan.nextLine();
		int[] grades1 = new int[3], grades2 = new int[3];
		String[] temp2 = temp.split(" ");
		String[] temp3 = temp1.split(" ");
		for(int i = 0; i <= 2;++i) {
			grades1[i] = Integer.parseInt(temp2[i]);
			grades2[i] = Integer.parseInt(temp3[i]);
		}
		for(int i = 0; i <= 1;++i) {
			System.out.print(compare.grades(grades1, grades2)[i] + " ");
		}
	}
}
