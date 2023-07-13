import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        int max = 0;
        int count = 0;
        
        for(int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            
            if(arr[i] > max) {
                max = arr[i];
                count = i+1; // index는 0부터 시작하기 때문
            }
        }
        sc.close();
        
        System.out.println(max);
        System.out.println(count);
    }
}