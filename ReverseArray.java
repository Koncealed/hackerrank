                        /*            https://www.hackerrank.com/challenges/arrays-ds                                 */


package learnJavaHere;

import java.util.*;

public class learnJavaHere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        String userInput = scanner.nextLine();
        String[] splited = userInput.split(" ");
        String reversed = "";
        for (int i = splited.length - 1; i >=0; i--) {
            reversed += splited[i]  + " ";
        }
        System.out.println(reversed);
    }
}
