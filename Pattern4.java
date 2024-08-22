/*  1
   212
  32123
 4321234
543212345     */
import java.util.Scanner;
public class Pattern4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Printing Space.
            for (int s = 1; s <= n-i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}       