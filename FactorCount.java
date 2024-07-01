/*Write a java program to count the number of factors of a given integer number. */

import java.util.Scanner;
public class FactorCount {

    public static int countFactor(int num) {
        int count = 2;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int count = countFactor(num);
        System.out.print(count);
        input.close();
    }
}
