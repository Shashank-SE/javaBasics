import java.util.Scanner;
public class Lcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int lcf = 0;
        int smallest = num1<num2?num1:num2;
        for(int i=1;i<=smallest;i++){
            if(num1%i==0 && num2%i==0){
                lcf = i;
                break;
            }
        }
        System.out.println(lcf);
    }
}
