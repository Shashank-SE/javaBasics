/*  Design an app to read age of three siblings Ramu, Raghu, Raju and store them in a variable. The app when executed should display the age of the youngest sibling..

Test Case1:
input- 10,20,45
output- 10

Test Case2:
input- 27,12,-20
output- Invalid age entered.
*/

import java.util.Scanner;
class AgeCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ramu's Age: ");
        int ramuAge = sc.nextInt();
        System.out.println("Enter Raghu's Age: ");
        int raghuAge = sc.nextInt();
        System.out.println("Enter Raju's Age: ");
        int rajuAge = sc.nextInt();
        

        if(ramuAge <=0 || raghuAge<=0 || rajuAge<=0) {
            System.out.println("invalid age entered");
        }
        else if(ramuAge < raghuAge && ramuAge < rajuAge) {
            System.out.println(ramuAge);
        } 
        else if(raghuAge < ramuAge && raghuAge < rajuAge) {
            System.out.println(raghuAge);
        }
        else {
            System.out.println(rajuAge);
        }
        sc.close();
    }
}