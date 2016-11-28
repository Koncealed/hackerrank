import java.util.Scanner;
class plusMinus {
	public static double[] array(int size,double[] array) {
		double[] newArray = new double[3];
		for(int i = 0; i < size;++i) {
			if(array[i] == 0) {
				++newArray[2];
			} else if(array[i] > 0) {
				++newArray[0];
			} else {
				++newArray[1];
			}
		}
		for(int i = 0; i < newArray.length;++i) {
			newArray[i] /= size;
		}
		return newArray;
	}
}

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.nextLine();
		String temp = scan.nextLine();
		scan.close();
		String[] temp1 = temp.split(" ");
		double[] array = new double[size];
		for(int i = 0; i < size;++i) {
			array[i] = Double.parseDouble(temp1[i]);
		}
		for(int i = 0; i < 3;++i) {
			System.out.println(plusMinus.array(size, array)[i]);
		}
	}
}
