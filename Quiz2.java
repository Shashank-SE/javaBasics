// Assume we have two integer numbers. write a program to find the largest number(using if condition).

import java.util.Scanner;
public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println(num1+" is largest.");
        } else{
            System.out.println(num2+"is largest.");
        }
        sc.close();
    }
}
