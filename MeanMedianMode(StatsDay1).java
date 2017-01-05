import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class day0part1 {
	public static double[] parseArray(String[] numbers) {
		double[] array = new double[numbers.length];
		for(int i = 0; i < numbers.length;++i) 
			array[i] = Integer.parseInt(numbers[i]);
		return array;
	}
	public static double mean(double[] numbers) {
		double amount = 0;
		for(int i = 0; i < numbers.length;++i) 
			amount += numbers[i];
		return amount / numbers.length;
	}
	public static double median(double[] numbers) {
		Arrays.sort(numbers);
		if(numbers.length % 2 == 0) 
			return (numbers[numbers.length / 2] + numbers[(numbers.length / 2) - 1]) / 2;
		 else 
			return numbers[(numbers.length / 2) + 1];
		
	}
	public static int mode(double[] tempNums) {
		int[] numbers = new int[tempNums.length];
		for (int i = 0; i < numbers.length;++i)
		    numbers[i] = (int)tempNums[i];
		ArrayList<Integer> array = new ArrayList<Integer>();
		boolean[] indexCheck = new boolean[numbers.length];
		boolean added = false;
		for(int i = 0;i < numbers.length;++i) {
			for(int j = 0; j < numbers.length;++j) {
				if(numbers[i] == numbers[j] && indexCheck[j] == false) {
					indexCheck[j] = true;
					if(added == false) {
						array.add(numbers[i]);
						added = true;
					}
				}
			}
			added = false;
		}
		int[] count = new int[array.size()];
		int checkAmount = 1;
		int temp = 0;
		for(int i = 0;i < array.size();++i) {
			for(int j = 0; j < numbers.length;++j) {
				if(array.get(i) == numbers[j]) {
					count[i] += 1;
				}
			}
			if(count[i] >= checkAmount) {
				checkAmount = count[i];
				temp = array.get(i);
			}
			if(i == array.size() - 1 && checkAmount == 1) {
				return array.get(0);
			}
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double amount = scan.nextInt();
		scan.nextLine();
		String[] array = scan.nextLine().split(" ");
		double[] numbers = parseArray(array);
		System.out.println(mean(numbers));
		System.out.println(median(numbers));
		System.out.println(mode(numbers));
	}

}
