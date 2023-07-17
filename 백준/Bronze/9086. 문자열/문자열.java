import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        for(int i = 0; i < cnt; i++) {
            String s = sc.next();
            System.out.println(s.charAt(0)+""+s.charAt(s.length()-1));
        }

        sc.close();
    }
}