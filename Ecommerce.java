/* Write a program to calculate  the total price of purchase after discount and display, total price before discount, total price after discount, also discount if any.

Test Case1:
Input: 200.0, 12
Output: 200.0
        200.0
    
Test Case2:
Input: 10000.0, 21
Output: 10000.0
        8836.0
        1164.0

*/
import java.util.Scanner;

public class Ecommerce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****Welcome to E-commerce Platform****");
        
        double totalPrice = 0.0;
        System.out.println("Enter price: ");
        double billAmt = sc.nextDouble();

        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Total price before discount:"+billAmt);

        if(age >= 13 && age <= 19) {
            totalPrice = billAmt -(billAmt *0.05);
            if(totalPrice > 5000) {
                totalPrice = totalPrice-(totalPrice*0.05);
            }
            System.out.println("Total price before discount:"+ totalPrice);
            System.out.println("Discount: "+ (billAmt-totalPrice));
        } 
        else if(age >= 20 && age <= 29) {
            totalPrice = billAmt-(billAmt * 0.06);
            if(totalPrice > 4000) {
                totalPrice = totalPrice-(totalPrice*0.06);
            }
            System.out.println("Total price before discount:"+ totalPrice);
            System.out.println("Discount: "+ (billAmt-totalPrice));
        } else if(age > 29){
            totalPrice = billAmt-(billAmt*0.15);
            System.out.println("Total price before discount:"+ totalPrice);
            System.out.println("Discount: "+ (billAmt-totalPrice));
        } else {
            totalPrice = billAmt-(billAmt*0.0);
            System.out.println("Total price before discount:"+ totalPrice);
            System.out.println("Discount: "+ (billAmt-totalPrice));
        }
        sc.close();
    }
}
