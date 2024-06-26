/*
Write a program to find the factors for a given natural numbers.
Test Case 1: 
	Input : 9
	Output : 1,3,9

Test Case 2: 
	Input : 15 
	Output : 1,3,5,15
*/

import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int num = input.nextInt();
        System.out.print("Factors are: ");
        for(int i = 1; i <= num; i++) {
            if(num%i==0) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
