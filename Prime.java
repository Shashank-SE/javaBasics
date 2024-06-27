/*Write a program to check whether the entered 
number is prime number or not.

Test Case 1: 
	Input : 7
	Output : prime

Test Case 2: 
	Input : 15
	Output : not prime

*/

import java.util.Scanner;
public class Prime{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Read Number
		int number = input.nextInt();
		int count = 2;
		for(int i = 2; i <= n/2; i++) {
			if(number%i==0){
				count++;
			}
		}
		if(count == 2) {
			System.out.println(number+" is a prime number");
		} else{
			System.out.println(number+" is not a prime number");
		}
		input.close();
	}
}
