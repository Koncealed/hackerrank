import java.util.Stack;
import java.util.Arrays;
import java.util.Scanner;
public class StacksPractice {
	public static void getAnswer(String[] input,int size) {
		Stack<Long> stack = new Stack<Long>();
		long max = Long.MIN_VALUE;
		for(int i = 0; i < size;++i) {
			if(input[i].startsWith("1")) {
				long value = Long.parseLong(input[i].split(" ")[1]);
				stack.push(value);
				if(max < value) {
					max = value;
				}
			} else if(input[i].startsWith("2")) {
				long value = stack.pop();
				Stack<Long> cloned = (Stack<Long>)stack.clone();
				if(max == value) {
					max = Long.MIN_VALUE;
					while(!cloned.isEmpty()) {
						long value1= cloned.pop();
						if(max < value1) {
							max = value1;
						}
					}
				}
			} else {
				System.out.println(max);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.nextLine();
		String[] input = new String[size];
		for(int i = 0;i < size;++i) {
			input[i] = scan.nextLine();
		}
		scan.close();
		getAnswer(input, size);
		
	}
}
