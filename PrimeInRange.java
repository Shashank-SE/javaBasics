import java.util.Scanner;
public class PrimeInRange {

    public static boolean isPrime(int n) {
        int count = 2;
        for(int i = 2; i<=n/2; i++) {
            if(n%i==0) {
                count++;
            }
        }
        return count==2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lowest range:");
        int m = sc.nextInt();
        System.out.println("Enter the Highest range:");
        int n = sc.nextInt();

        for(int i = m; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
