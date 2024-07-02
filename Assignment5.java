/*
You are developing a biology learning application that introduces students to the concept of balance in numbers.
As part of an interactive quiz feature, you want to create a program that determines if a given number exhibits "Harmony."
Concept:
Harmonious Number: A positive integer N is classified as a Harmonious Number if the sum of its first and last digits equals the sum of its remaining digits.
Non-Harmonious Number: If the sum of the first and last digits does not equal the sum of the remaining digits, the number is classified as Non-Harmonious.

Example:
For input number 2468:
First digit and Last digit: 2,8 and Remaining digits: 4, 6
Sum of first and last digits = 2 + 8 = 10
Sum of remaining digits = 4 + 6 = 10
Since the sum of first and last digits equals the sum of remaining digits, 2468 is a Harmonious Number.

Test Case 1: 
	Input  : 2468
	Output : Harmony

Test Case 2: 
	Input  : 9474
	Output : Non-Harmony
 */

import java.util.Scanner;
public class Assignment5 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in ) ;
        int num = sc.nextInt() ;
        int sum1 = num%10;
        num /= 10;
        int sum2 = 0;
        while(num>9) {
            int d = num%10;
            sum2 = sum2+d;
            num /= 10;
        }
        sum1 = sum1 + num ;
        if(sum1 == sum2) {
            System.out.println("Harmony");
        } else {
            System.out.println("Non-Harmony");
        }
        sc.close() ;
    }
}