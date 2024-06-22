// Write a program to read four integer number and display the smallest Number. Using if condition
import java.util.Scanner;
class Quiz1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt(); 
        int n2 = sc.nextInt(); 
        int n3 = sc.nextInt();        
        int n4 = sc.nextInt();
        int smallest = n1;

        if(n2 < smallest) {
            smallest = n2;
        }
        if(n3< smallest) {
            smallest = n3;
        }
        if(n4 < smallest) {
            smallest = n4;
        }
        System.out.println(smallest);

        sc.close();
        
    }
}