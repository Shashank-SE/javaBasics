/*Write a java program to find LCM of a given number....*/

import java.util.Scanner;
public class Lcm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = sc.nextInt();
        int lcm = num1>num2?num1:num2;
        while(true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
        sc.close();
    }
}