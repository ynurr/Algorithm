import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 바구니 총 개수
        int m = sc.nextInt(); // 공을 바꾸려는 횟수
        int arr[] = new int[n];
        int temp = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for(int j = 0; j < m; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            temp = arr[a-1];
            arr[a-1] = arr[b-1]; 
            arr[b-1] = temp;
        }

        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}