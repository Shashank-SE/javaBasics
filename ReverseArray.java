import java.util.Scanner;
public class ReverseArray {

    public static int[] revArray(int[] arr, int first, int last) {
        int[] arr1 = new int[3];
        while(first<last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for(int i = 0; i<arr.length; i++) {
            arr1[i] = i;;
        }
        return arr1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        int first = 0;
        int last = arr.length-1;
        int[] revarr = revArray(arr, first, last);
        System.out.println(revarr);
    }
}
