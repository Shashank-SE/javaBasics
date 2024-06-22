import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("*****Please Enter Time in 24-hours Format*****");

        System.out.print("Enter Time: ");
        int time = sc.nextInt();

        if(time >= 5 && time <= 11) {
            System.out.println("Good Morning");
        } else if(time >= 12 && time <= 16) {
            System.out.println("Good Afternoon");
        } else if(time >= 17 && time <= 20) {
            System.out.println("Good Evening");
        } else if((time >= 21 && time < 24) || (time >= 0 && time <= 4)){
            System.out.println("Good Night");
        } else {
            System.out.println("Invalid Time");
        }
        sc.close();
    }
}
