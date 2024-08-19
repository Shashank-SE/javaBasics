// WRITE A JAVA PROGRAM TO CHECK GIVEN STRING IS PPALINDROME OR NOT..
import java.util.Scanner;
public class StringPalin {
	public static String getPalin(String str) {
		String str1 = "";
		for(int i = str.length()-1; i>=0; i--) {
			str1 += str.charAt(i);
		}
		if(str.equals(str1)) {
			return "palindrome String";
		} else {
			return"Not Palindrome String";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toLowerCase();
		System.out.println(getPalin(str));
		sc.close();
	}
}