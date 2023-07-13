import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        
        for(int i = 1; i <= n; i++) { // i: 행
            for(int j = 1; j <= i; j++) { // i만큼 반복하며 별 출력
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}