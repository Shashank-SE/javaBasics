//Assume we have two numbers write a program to find the largest number.
/* Test Case1:
  input = 15,20;
  output = 20

  Test Case1:
  input = -15,56;
  output = 56
*/

import java.util.Scanner;
class First{
    public static void main(String[] args) {
        int num1,num2;
        Scanner s = new Scanner(System.in);
        num1 = s.nextInt();
        num2 = s.nextInt();
        if(num1>num2) {
            System.out.println(num1);
        } else{
            System.out.println(num2);
        }
        s.close();
    }
}