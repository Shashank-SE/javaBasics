/*Write a program to check the given number is prime or not*/

import java.util.Scanner;
public class PrimeNum {

    public static boolean isPrime(int n){
        if(n < 1) {
            return false;
        }
        for(int i = 2; i <= n/2; i++) {
			if(n%i==0){
				return false;
			}
		}
        return true;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Read Number
		int number = input.nextInt();
        if(isPrime(number)) {
            System.out.println(number+" is Prime");
        } else {
            System.out.println(number+" is not Prime");
        }
		input.close();
	}
}
