/*Write a java program to find highest common factor...*/

import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = 1;
        int largest = num1>num2? num1:num2;
        for(int i = largest/2; i > 1; i--) {
            if(num1%i == 0 && num2%i == 0){
                hcf = i;
                break;
            } else {
                i--;
            }
        }
        System.out.println("Highest common factor is: "+hcf);
        sc.close();
    }
}
