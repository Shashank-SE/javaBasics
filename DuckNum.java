//find the given number is Duck or Not...
import java.util.Scanner;
public class DuckNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		while(num>0) {
			int temp = num%10;
			if(temp == 0) {
				flag = true;
				break;
			}
			num /= 10;
		}
		System.out.println(flag==true?"Duck Number.":"Not Duck Number.");
		sc.close();
	}
}