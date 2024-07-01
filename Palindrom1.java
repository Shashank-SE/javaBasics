/*Write a program to find the reverse of a given number & check whether the given number is palidrome or not... */

import java.util.Scanner;
public class Palindrom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cmp = num;
        int temp = 0;
        int rev = 0;
        while (num > 0) {
            temp = num % 10;
            rev = rev * 10 + temp;
            num = num/10;
        }
        System.out.println(rev);
        if(rev == cmp) {
            System.out.println("palindrom");
        } else{
            System.out.println("not palindrom");
        }
        sc.close();
    }
}
