import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = sc.next().split("");
        int result = 0;

        for(int i = 0; i < n; i++) {
            result += Integer.parseInt(arr[i]);
        }
        
        System.out.println(result);

        sc.close();
    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();
        int result = 0;

        for(int i = 0; i < n; i++) {
            result += a.charAt(i)-'0'; 
            // charAt(0)부터 마지막 charAt(n)까지 누적 합 구하기
            // charAt()은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0' 을 해줘야 입력받은 숫자 값 그대로를 사용할 수 있다.
        }
        
        System.out.println(result);

        sc.close();
    }
}
*/
