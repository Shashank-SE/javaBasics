/* write a java program to print the following pattren..
A 
1 
A B 
1 2 
A B C 
1 2 3 
A B C D 
1 2 3 4 
A B C D E 
1 2 3 4 5  */
public class Pattern1 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			char ch = 'A';
			int count = 1;
			for(int j = 1; j<=i; j++) {
				System.out.print(ch +" ");
				ch++;
			}
			System.out.println();
			for(int k = 1; k<=i; k++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}

