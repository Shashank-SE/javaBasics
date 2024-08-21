import java.util.Scanner;
public class ReverseArr {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size =  sc.nextInt();
		int[] arr = new int[size];
		int temp = 0;
		int start = 0;
		int end = arr.length-1;
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
