import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        int max = 0;
        
        if (a == b && b == c) {
            result = 10000+a*1000;
        } else if (a == b || a == c) {
            result = 1000+a*100;
        } else if (b == c) {
            result = 1000+b*100;
        } else {
            if (a >= b && a >= c) {
                max = a;
            } else if (b >= a && b>= c) {
                max = b;
            } else {
                max = c;
            }
            result = max*100;
        }
        System.out.println(result);
    }
}