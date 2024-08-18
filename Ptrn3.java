/* 
01 02 03 04 05 
10 09 08 07 06 
11 12 13 14 15 
20 19 18 17 16 
21 22 23 24 25 
30 29 28 27 26
*/
import java.util.Scanner;
public class Ptrn3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=n;j++) {
				if(count<10) {
					System.out.print("0"+count+" ");
					count++;
				} else {
				System.out.print(count+" ");
				count++;
				}
			}
			count+=n-1;
			System.out.println();
			for(int k=n; k>=1; k--) {
				if(count<10) {
					System.out.print("0"+count+" ");
					count--;
				} else {
					System.out.print(count+" ");
					count--;
				}
			}
			count+=n+1;
			System.out.println();
		}
		sc.close();
	}
}