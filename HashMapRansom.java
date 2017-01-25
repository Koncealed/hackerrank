import java.util.HashMap;
import java.util.Scanner;
/*                                First time working with HashMaps.
 *                             Really useful I could of used these alot.
 *                                          Examples / Notes:
 *           In mean median mode I could of counted occurences this way instead of naive 2 for loops.
 *                       Concept of key and and a value following is very efficent. 
 */
public class HashMapPractice {
	public static int[] parseArray(String[] numbers) {
		int[] array = new int[numbers.length];
		for(int i = 0; i < numbers.length;++i) 
			array[i] = Integer.parseInt(numbers[i]);
		return array;
	}
	
	public static boolean getAnswer(String[] words, String[] wantedWords) {
		HashMap<String, Integer> wordMap = new HashMap<>();
		for(int i = 0;i < words.length;++i) { 
			if(i == 0) {  // Only once this will happen.
				for(int j = 0;j < words.length;++j) { // Add everything into the HashMap starting at 0
					wordMap.put(words[j], 0);
				}
			}
			wordMap.put(words[i], wordMap.get(words[i]) + 1); // Always up count by 1. Since HashMaps will just over ride no need to do anything else just let it be.
		}
		for(int i = 0;i < wantedWords.length;++i) { // Loop through the words we want
			if(wordMap.containsKey(wantedWords[i])) { //If the wantedWord they we are on if a key value in the wordMap.....
				wordMap.put(wantedWords[i], wordMap.get(wantedWords[i]) - 1); // Then subtract the keys value by 1
				if(wordMap.get(wantedWords[i]) < 0) { // if we run out of of numbers
					return false; 
				}
			} else if(wordMap.get(wantedWords[i]) == null) { // if the value dosen't even exsit 
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] integers = parseArray(scan.nextLine().split(" "));
		String[] words = scan.nextLine().split(" ");
		String[] wantedWords = scan.nextLine().split(" ");
		System.out.println(getAnswer(words, wantedWords) ? "Yes" : "No"); // Tenorary operator.
	}
}
