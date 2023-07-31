import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[100][100];
        int n = sc.nextInt(); // 색종이의 수
        int result = 0;

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j < a+10; j++) { // 크기가 10인 정사각형
                for(int k = b; k < b+10; k++) {
                    arr[j][k] = 1; // 색종이가 붙은 검은 영역을 1로 채워준다
                }
            }
        }

        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(arr[i][j] == 1) {};
                result += arr[i][j];
            }
        }

        System.out.println(result);

        sc.close();
    }
}
