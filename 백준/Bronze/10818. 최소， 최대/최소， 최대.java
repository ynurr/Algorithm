import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];
    int min = 1000000;
    int max = -1000000;

    for(int i = 0; i < N; i++) {
        arr[i] = sc.nextInt();

        if(arr[i] > max) {
            max = arr[i];
        }
        if(arr[i] < min) {
            min = arr[i];
        }
    }
    sc.close();
        
    System.out.println(min+" "+max);
    }
}