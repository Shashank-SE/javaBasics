/*Write a program to find the reverse of a given number & check whether the given number is palidrome or not.
Test Case1:
input- 6767
output- false

Test Case2:
input- 976679
output- true
*/

import java.util.Scanner;
public class Palindrom {

    public static int revNum(int num) {
        int rev = 0;;
        int temp = 0;
        while (num>0) {
            temp = num%10;
            rev = rev*10 + temp;
            num = num/10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        if(revNum(num)==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println(revNum(number));
        System.out.println(isPalindrome(number));
        input.close();
    }
}