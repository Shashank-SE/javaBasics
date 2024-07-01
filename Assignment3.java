/*Write a Java program to Find the sum and product of each  digit of the given integer number .

TestCase: 
    Input : 7645
****Output****  
    Sum : 22
    Product  :  840 */
    
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while(num>0) {
            int d = num%10;
            sum = sum+d;
            prod = prod*d;
            num /= 10;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Product: "+prod);

        sc.close();
    }
}
