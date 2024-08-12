//Q. write a java program to check nth prime number...

import java.util.Scanner;
public class Nth_Prime {
    public static boolean isPrime(int num) {
        int c = 0;
        for(int i = 1; i <= num; i++) {
            if(num%i==0){
                c++;
            }
        }
        return c==2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; ; i++) {
            if(isPrime(i)) {
                count++;
            } 
            if(count == num) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}