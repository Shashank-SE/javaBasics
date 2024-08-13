/*  Print fibonaciii from the given range...
S_Point- 100
E_Point- 1000
output - 144, 233, 377, 610, 987.
*/
import java.util.Scanner;
public class FibbonaciiInRange {
    public  static void fibInRange(int sPoint, int ePoint) {
        int f1 = 0, f2 = 1, next = 0;
        while(f1<=ePoint) {
            if(f1>=sPoint) {
                System.out.println(f1);
            }
            next = f1+f2;
            f1 = f2;
            f2 = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sPoint = sc.nextInt();
        int ePoint = sc.nextInt();
        fibInRange(sPoint, ePoint);
        sc.close();
    }
}