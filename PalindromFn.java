/*Write a program to find the reverse of a given number & check whether the given number is palidrome or not.
Test Case1:
input- 6767
output- false

Test Case2:
input- 976679
output- true
*/
import java.util.Scanner;
public class PalindromFn {
    public static boolean isPalindrome(int num) {
        int comp = num;
        int rev = 0;
        int temp = 0;
        while (num > 0) { 
            temp = num%10;
            rev = rev*10+temp;
            num = num/10;
        }
        if(rev != comp) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = isPalindrome(num);
        System.out.println(result);
        sc.close();
    }
}
