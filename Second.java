// Write a java program to read two character and print character with smallest ASCII.

/*Test Case1:
 input:- F,R
 output:- F
 
 Test Case2:
 input:- r,o
 output:- o
 
 */

import java.util.Scanner;
public class Second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        char ch1 = sc.next().charAt(0);

        if(ch < ch1) {
            System.out.println(ch);
        } else {
            System.out.println(ch1);
        }
        sc.close();
    }
}
