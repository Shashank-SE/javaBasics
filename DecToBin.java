import java.util.Scanner;
public class DecToBin {
    public static void binary(int n) {
        int i = 0;
        int[] bin = new int[50];
        while(n>0) {
            bin[i] = n % 2;
            n = n/2;
            i++;
        }
        for(int j = i-1; j >=0; j--) {
            System.out.print(bin[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        binary(decimal);
        sc.close();
    }
}