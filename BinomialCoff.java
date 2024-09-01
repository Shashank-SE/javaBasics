/**********BINOMMIAL COEFFICIENT**************
Formula= n! / r!(n-r)!   */
import java.util.Scanner;
public class BinomialCoff {
    public static int calfact(int n) {
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int binCoffe(int n, int r) {
        int fact = calfact(n);
        int rfact = calfact(r);
        int nrfact = calfact(n-r);
        int bC = fact / (rfact * nrfact);
        return bC;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binCoffe(n, r));
        sc.close();
    }
}
