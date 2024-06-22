/*Write a program to check whetger a given side of a triangle forms a pythagorean triple. Take length of three sides as input.
 
Test Case1:
input: 4,3,5
output: true
 */

 
import java.util.Scanner;
public class Quiz4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int side1 = s.nextInt();
        int side2 = s.nextInt();
        int side3 = s.nextInt();

        System.out.println((side1*side1 + side2*side2) == (side3*side3) || (side1*side1 + side3*side3) == (side2*side2) || (side2*side2 + side3*side3) == (side1*side1));
    }
}
