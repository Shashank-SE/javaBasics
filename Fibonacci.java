/// Print fibonacci series of n number...
import java.util.Scanner;
public class Fibonacci {
    public static void fibbo(int num) {
        int n = 0, n1 = 1, i = 1;
        while(i<=num) {
            System.out.print(n +" ");
            int sum = n+n1;
            n = n1; 
            n1 = sum;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fibbo(num);
        sc.close();
    }    
}