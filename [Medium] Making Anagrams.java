import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class Anagram {
	public static int getAnagram(String word1, String word2) {
		boolean[] indexCheck1 = new boolean[word1.length()];
		boolean[] indexCheck2 = new boolean[word2.length()];
		ArrayList<Character> wordlist1 = new ArrayList<Character>();
		ArrayList<Character> wordlist2 = new ArrayList<Character>();
		for(int i = 0;i < word1.length();++i) {
			for(int j = 0;j < word2.length();++j) {
				if(word1.charAt(i) == word2.charAt(j) && indexCheck2[j] == false) {
					wordlist2.add(word2.charAt(j));
					indexCheck2[j] = true;
					break;
				}
			}
		}
		for(int i = 0;i < word2.length();++i) {
			for(int j = 0;j < word1.length();++j) {
				if(word2.charAt(i) == word1.charAt(j) && indexCheck1[j] == false) {
					wordlist1.add(word1.charAt(j));
					indexCheck1[j] = true;
					break;
				}
			}
		}
		return (word1.length() + word2.length()) - (wordlist1.size() + wordlist2.size());
	}
}

public class Solution {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		    String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        System.out.println(Anagram.getAnagram(word1,word2));
	}
}
