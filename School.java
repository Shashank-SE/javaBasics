import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter day as Capitilized format");
        System.out.println("Enter Day: ");
        String day = sc.next();

        switch (day) {
            case "Monday":
            case "Wedneday":
                System.out.println("Basket Ball");
                break;
            case "Tuesday":
            case "Friday":
                System.out.println("Tennis");
                break;
            
            case "Thursday":
                System.out.println("Cricket");
                break;
            case "Saturday":
                System.out.println("Exercise");
                break;
            case "Sunday":
                System.out.println("Holiday.");
                break;
        
            default:
            System.out.println("Invalid Input");
                break;
        }

        sc.close();
    }
}
