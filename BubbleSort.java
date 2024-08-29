// Write a program to implement Bubble Sort.
import java.util.Scanner;
public class BubbleSort {
    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j =0; j < arr.length-1-i; j++ ) {
                if(arr[j] > arr[j+1])          //for ascending Order.
                // if(arr[j] < arr[j+1])         //for descending Order.
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } 
    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bubble(arr);
        print(arr);
        sc.close();
    }
}               
