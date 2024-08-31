// PAIR OF ARRAY ELEMENTS............
import java.util.Scanner;
public class PairOfArray {
    public static void makePair(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            int curr = arr[i];
            for (int j = i+1; j<arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ") ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        makePair(arr);
        sc.close();
    }
}
