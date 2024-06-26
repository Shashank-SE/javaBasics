/*
Write a Java Program to print the Factorial of the given number.
Test Case 1: 
	Input : 3
	Output : 6

Test Case 2: 
	Input : 5
	Output : 120

Test Case 3: 
	Input : 9
	Output : 362880
*/
import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int factoral = 1;
        for(int i = 2; i<=num; i++) {
            factoral *= i;
        }
        System.out.println("Factorial of "+num+" is: "+factoral);
        sc.close();
    }
}