import java.util.*;


class staircase {
	public static void maker(int size) {
		for(int i = 1; i <= size;++i){
			for(int j = size; j > 0;--j) {
				if(i >= j) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				 }
			}
			System.out.println();
		}
	}
	
}
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size  = scan.nextInt();
		staircase.maker(size);
	}
}

/*   012
 *  0  #
 *  1 ##
 *  2###
 * 		
 */
		
