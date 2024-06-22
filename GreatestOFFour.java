/*Write a program to find greatest of four number.
Test Case1:
input- 2,-5,3,9
output- 9 
Test Case2:

input- -23,-25,-18,-20
output- 18
 */

import java.util.Scanner;
public class GreatestOFFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter Fourth Number: ");
        int num4 = sc.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println(num1);
        }
        else if (num2 > num3 && num2 > num4) {
            System.out.println(num2);
        }
        else if (num3 > num4) {
            System.out.println(num3);
        }
        else {
            System.out.println(num4);
        }
        sc.close();
    }
}
