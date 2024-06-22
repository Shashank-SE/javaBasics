/*java program to read the current temperature value in celsius & convert into Fahrenheit, then check if it falls within the specified range, if it does, print"Temperature is within the range".
Specified Range.
minnimum Temprature = 70F
Maximum Temperature = 80F
*/

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double minTemp = 70.0;
        double maxTemp = 80.0;
        System.out.println("Enter Current Temperature: ");
        double curTemp = sc.nextInt();

        // Converting celsius to fahrenheit
        curTemp = curTemp*(9.0/5.0)+32;

        System.out.println(curTemp);

        if(curTemp >= minTemp && curTemp <= maxTemp) {
            System.out.println("Temperature is within the range");
        } else {
            System.out.println("Temperature is out of the range");
        }
        sc.close();
    }
    
}
