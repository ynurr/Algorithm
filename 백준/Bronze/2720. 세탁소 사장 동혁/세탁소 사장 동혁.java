import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++) {
            int num = sc.nextInt();

            while (num > 0) {
                int q = num/25;
                num = num%25;
                int d = num/10;
                num = num%10;
                int n = num/5;
                num = num%5;
                int p = num;
                num = 0;
                System.out.println(q+" "+d+" "+n+" "+p+" ");
            }
        }
        
        sc.close();
    }
}