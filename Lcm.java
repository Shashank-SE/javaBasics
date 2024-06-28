/* Write a program to calculate LCM of given two number...*/
import java.util.Scanner;
public class Lcm {
    
    public static int findLcm(int num1, int num2) {
        int lcm = num1>num2?num1:num2;
        for(;;lcm++){
            if(lcm%num1==0 && lcm%num2==0){
                break;
            }
        }
        return lcm;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int lcm = findLcm(num1, num2);
        System.out.println("LCM of "+num1+" & "+num2+" is :"+lcm);

        input.close();
    }
}
