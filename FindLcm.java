import java.util.Scanner;
public class FindLcm {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int res = (num1 > num2) ? num1:num2;
    while(true) {
        if (res % num1 == 0 && res % num2 == 0) {
            break;
        }
        res++;
    }
    System.out.println("L.C.M= "+res);
    sc.close();
   } 
}
