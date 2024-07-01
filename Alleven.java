import java.util.Scanner;
public class Alleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        for(int i = m; i<= n; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
        input.close();
    }
}
