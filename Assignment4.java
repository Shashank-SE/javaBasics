/*Write a Java program to check whether the sum of the digits of a given number is equal to the product of the digits of the number.
TestCase : 
     Input : 1124
     Output :  true */

import java.util.Scanner;
public class Assignment4 {
        public static int Sum(int num) {
        int s = 0;
        int d = num%10;
        s = s+d;
        num /= 10;

        return s;
    }

    public static int Prod(int num) {
        int p = 1;
        int d = num%10;
        p = p*d;
        num /= 10;
        return p;
    }
    public static boolean isEqual(int sum, int prod) {
        if( sum == prod ) {
            return true ;
        }
        return false ;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int num = sc.nextInt();
       int sum = Sum(num);
       int prod = Prod(num);
       System.out.println(isEqual(sum, prod));
       sc.close();
    }
}