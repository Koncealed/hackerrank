import java.util.Scanner;

public class Solution {
	public static double[] parseArray(String[] numbers) {
		double[] array = new double[numbers.length];
		for(int i = 0; i < numbers.length;++i) 
			array[i] = Integer.parseInt(numbers[i]);
		return array;
	}
	public static double getNumerator(double[] numbers, double[] weights) {
		double returnVal = 0;
		for(int i = 0;i < numbers.length;++i) 
			returnVal += (numbers[i] * weights[i]);
		return returnVal;
	}
	public static double getDenominator(double[] numbers, double[] weights) {
		double returnVal = 0;
		for(int i = 0;i < numbers.length;++i) 
			returnVal += weights[i];
		return returnVal;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double amount = scan.nextDouble();
		scan.nextLine();
		String[] numbersStr = scan.nextLine().split(" ");
		String[] weightsStr = scan.nextLine().split(" ");
		double[] numbers = parseArray(numbersStr);
		double[] weights = parseArray(weightsStr);
		double answer = getNumerator(numbers,weights) / getDenominator(numbers, weights);
		System.out.println(Math.round (answer * 10.0) / 10.0);
	}

}
