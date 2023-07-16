import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 바구니 총 개수
        int m = sc.nextInt(); // 공을 넣는 횟수
        int arr[] = new int[n];
        
        for(int i = 0; i < m; i++) {
            int start = sc.nextInt(); // start 바구니부터
            int end = sc.nextInt(); // end 바구니까지
            int num = sc.nextInt(); // num번 공을 넣는다

            for(int j = start-1; j < end; j++) { // start가 1번부터 시작해서 -1 해준다
                arr[j] = num;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}