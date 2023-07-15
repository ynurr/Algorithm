import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 정수의 개수
        int arr[] = new int[n]; // 정수 담을 배열
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int c = sc.nextInt(); // 찾아야 하는 정수

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == c) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}