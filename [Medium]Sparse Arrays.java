import java.util.Scanner;

class check {
	public static int[] checker(String[] words, String[] checkWords, int size) {
		int[] checked = new int[size];
		for(int i = 0; i < checkWords.length;++i) { /*  Loop to go through all checking words */
			for(int j = 0; j < words.length;++j) {  /*  Loop to go through all words          */
				if(checkWords[i].equals(words[j])) {
					++checked[i];
				}
			}
		}
		return checked;
	}
}

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		scan.nextLine();
		String[] words = new String[amount];
		for(int i = 0; i < amount;++i) {
			words[i] = scan.nextLine();
		}
		int checkedWordAmount = scan.nextInt();
		scan.nextLine();
		String[] checkWords = new String[checkedWordAmount];
		for(int i = 0; i < checkedWordAmount;++i) {
			checkWords[i] = scan.nextLine();
		}
		for(int i = 0; i < checkWords.length ;++i) {
			System.out.println(check.checker(words, checkWords, checkedWordAmount)[i]);
		}
	}
}
