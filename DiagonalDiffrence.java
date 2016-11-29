/*                     https://www.hackerrank.com/challenges/diagonal-difference                    */    
import java.util.*;
class diffrence {
	public static int getDiffrence(String[] input,int size) {
		int rtl = 0;
		int ltr = 0;
		int[][] graph = new int[size][size];
		int count = graph.length - 1;
		for(int i = 0; i < size;++i) {
			String[] input1 = input[i].split(" ");
			for(int j = 0; j < size;++j) {
				graph[i][j] = Integer.parseInt(input1[j]);
			}
		}
		for(int i = 0; i < size;++i) {
			ltr += graph[i][i];
			rtl += graph[i][count];
			count--;
		}
		return Math.abs(ltr - rtl);
	}
}
public class Solution {
	public static void main(String[] args) {
		int amount = 0;
		Scanner scan = new Scanner(System.in);
		amount = scan.nextInt();
		scan.nextLine();
		String[] input = new String[amount];
		for(int i = 0; i < amount;i++){
			input[i] = scan.nextLine();
		}
		System.out.println(diffrence.getDiffrence(input, amount));
	}
}
