//Program to remove extra space between two words...
import java.util.Scanner;
public class IgnoreSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && str.charAt(i+1) == ' ') {
                continue;
            }
            newStr = newStr+str.charAt(i);
        }
        System.out.println(newStr);
        sc.close();
    }
}