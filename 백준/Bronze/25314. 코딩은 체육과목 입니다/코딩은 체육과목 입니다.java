import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String result = "";

        for(int i = 1; i <= n/4; i++) {
            result = result + "long ";
        }

        System.out.println(result + "long int");
    }
}
