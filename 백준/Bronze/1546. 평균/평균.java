import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int max = 0;
        int sum = 0;
        double avg = 0.0;
        int score;
        
        for(int i = 0; i < n; i++) {
            score = sc.nextInt();
            
            if(score > max) {
                max = score;
            }
            sum += score;
        }
        sc.close();
        
        avg = 100.0 * sum / max / n;
        System.out.print(avg);
    }
}