//FACTORIAL USING RECURSION....
import java.util.Scanner;
public class RecrFact {
    public static int factPrint(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num*factPrint(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factPrint(num));
        sc.close();
    }
}