import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class Anagram {
	public static int getAnagram(String word1, String word2) {
		boolean[] indexCheck1 = new boolean[word1.length()]; // Since Anagrams need all the letters the same. We need to check if the index has been checked.
		boolean[] indexCheck2 = new boolean[word2.length()]; // Read Above
		ArrayList<Character> wordlist1 = new ArrayList<Character>(); //ArrayList to append the letters that fit.
		ArrayList<Character> wordlist2 = new ArrayList<Character>(); // Read Above.
		for(int i = 0;i < word1.length();++i) {// Control first loop for the first set of letters
			for(int j = 0;j < word2.length();++j) { // Control second loop for the second set of letters
				if(word1.charAt(i) == word2.charAt(j) && indexCheck2[j] == false) { // pretty simple ,BUT it needs to check if the index is marked as false or so it will be marked as true so it won't get checked over again and appended.
					wordlist2.add(word2.charAt(j)); // append in new ArrayList
					indexCheck2[j] = true; // Make sure it does not get checked over again.
					break; // break the statement so no more get checked over.				}
			}
		}
		for(int i = 0;i < word2.length();++i) { // Does the same thing as above
			for(int j = 0;j < word1.length();++j) {
				if(word2.charAt(i) == word1.charAt(j) && indexCheck1[j] == false) {
					wordlist1.add(word1.charAt(j));
					indexCheck1[j] = true;
					break;
				}
			}
		}
		return (word1.length() + word2.length()) - (wordlist1.size() + wordlist2.size()); // return the inital word's length and minus it by the new size of ArrayList.
	}
}

public class Solution {
	public static void main(String[] args) { // Getting user input simple enough.
        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        System.out.println(Anagram.getAnagram(word1,word2));
	}
}
