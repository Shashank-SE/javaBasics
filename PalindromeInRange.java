import java.util.Scanner;
public class PalindromeInRange {
	public static boolean isPalin(int num) {
		int num1 = num;
		int reverse = 0;
		while(num>0) {
			int rem = num%10;
			reverse = (reverse*10)+rem;
			num /= 10;
		}
		return num1 == reverse;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sPoint = sc.nextInt();
		int ePoint = sc.nextInt();;
		for(int num = sPoint; num<=ePoint; num++) {
			if(isPalin(num)) {
				System.out.println(num);
			}
		}
		sc.close();
	}
}