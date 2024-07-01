import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int count = 0;
        int num1 = sc.nextInt();
        if(num1%2==0) {
            count++;
        }
        int num2 = sc.nextInt();
        if (num2%2==0) {
            count++;
        }
        int num3 = sc.nextInt();
        if (num3%2==0) {
            count++;
        }


        switch (count) {
            case 1: 
                if(num1%2==0) {
                    System.out.println(num1);
                } else if(num1%2==0) {
                    System.out.println(num2);
                } else {
                    System.out.println(num3);
                }
                break;
            
            case 2:
                if(num1%2==0 && num2%2==0) {
                    System.out.println(num1+num2);
                } else if(num1%2==0 && num3%2==0){
                    System.out.println(num1+num3);
                }
                else if(num2%2==0 && num3%2==0) {
                    System.out.println(num2+num3);
                }
                break;

            case 3:
                System.out.println(num1*num2*num3);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        sc.close();
    }
}