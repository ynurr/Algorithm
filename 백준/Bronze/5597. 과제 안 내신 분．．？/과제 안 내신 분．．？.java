import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[30];
        
        for(int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            arr[n-1] = 1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 1) {
                System.out.println(i+1);
            }
        }

        sc.close();
    }
}