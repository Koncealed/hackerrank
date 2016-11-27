import java.util.Scanner;

class plusMinus {
	public static double[] array(int size,double[] array) {
		/*    [0] == is postive numbers
	        [1] is negative numbers
	        [2] all 0's 
	         */
		double[] newArray = new double[3];
		for(int i = 0; i < size;++i) {
			if(array[i] == 0) {
				++newArray[2];
			} else if(array[i] > 0) {
				++newArray[0];
			} else if(array[i] < 0) {
				++newArray[1];
			}
		}
		newArray[0] = newArray[0] / size;
		newArray[1] = newArray[1] / size;
		newArray[2] = newArray[2] / size;
		return newArray;
	}
}



public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.nextLine();
		String temp = scan.nextLine();
		String[] temp1 = temp.split(" ");
		double[] array = new double[size];
		for(int i = 0; i < size;++i) {
			array[i] = Double.parseDouble(temp1[i]);
		}
		System.out.println(plusMinus.array(size, array)[0]);
		System.out.println(plusMinus.array(size, array)[1]);
		System.out.println(plusMinus.array(size, array)[2]);
		
	}
}
