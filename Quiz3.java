/*Write a program to track a person's daily steps, take number of steps as input and outputs the corresponding activity level according to the following criteria.
Less than 5000 steps - Sendentary.
5000 to 7499 steps   - Low Active
7500 to 9999 steps   - Somewhat Active
10000 to 12499 steps - Active
12500 or more steps  - Highly Active

*/

import java.util.Scanner;
public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter steps: ");
        int steps = sc.nextInt();
        if(steps < 5000) {
            System.out.println("Sedentary");
        } else if(steps >= 5000 && steps <= 7499) {
            System.out.println("Low Active");
        } else if(steps >= 7500 && steps <= 9999) {
            System.out.println("Somewhat Active");
        } else if(steps >= 10000 && steps <= 12499) {
            System.out.println("Active");
        } else {
            System.out.println("Highly Active");
        }
        sc.close();
    }
}