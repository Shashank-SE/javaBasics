import java.util.Scanner;
public class BinToDec {
    public static void binToDec(int binNum) {
        int fNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int ld = binNum % 10;
            decNum = decNum + ld * (int)Math.pow(2,pow);
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + fNum + " is " + decNum); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        binToDec(num);
        sc.close();
    }
}
