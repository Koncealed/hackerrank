/*                     https://www.hackerrank.com/challenges/diagonal-difference                    */    
import java.util.*;
class diffrence {
	public static int getDiffrence(String[] input,int size) {
		int rtl = 0;
		int ltr = 0;
		int[][] graph = new int[size][size];
		int count = graph.length - 1;
		for(int i = 0; i < size;++i) {
			ltr += Integer.parseInt(graph[i][i]);
			rtl += Integer.parseInt(graph[i][count]);
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
