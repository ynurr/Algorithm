import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 바구니 총 개수
        int m = sc.nextInt(); // 바구니를 역순으로 만들 횟수
        int arr[] = new int[n];
        int temp = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j < b; j++) {
                int c = b--;
                temp = arr[j-1];
                arr[j-1] = arr[c-1];
                arr[c-1] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
