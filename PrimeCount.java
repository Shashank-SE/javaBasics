/*.Write a program to find count of prime numbers present  between a given range.
Constraints : User needs to enter the range (lower bound and upper bound) 
where lower bound < upper bound and lower bound > 2 . 
If these conditions are not satisfied then program should print Invalid range. */

import java.util.Scanner;
public class PrimeCount {

    public static boolean isPrime(int n) {
        int count = 2;
        for(int i = 2; i<=n/2; i++) {
            if(n%i==0) {
                count++;
            }
        }
        return count==2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lowest range:");
        int m = sc.nextInt();
        System.out.println("Enter the Highest range:");
        int n = sc.nextInt();

        if(m>2 && m<n){
            for(int i = m; i<=n; i++) {
                if(isPrime(i)) {
                    System.out.print(i+" ");
                }
            }
        } else {
            System.out.println("Invalid Range..");
        }
        
        sc.close();
    }
}
