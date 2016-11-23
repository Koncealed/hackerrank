import java.util.Scanner; //https://www.hackerrank.com/challenges/30-recursion
class factorial {
    
    public static int factorial(int factAmount) {
        int result = factAmount;
        for(int i = factAmount - 1; i > 0;--i) {
            result *= i;
        }
        return result;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int factAmount = scan.nextInt();
        System.out.println(factorial.factorial(factAmount));
    }
}
