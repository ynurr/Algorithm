import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); // 시
		int M = sc.nextInt(); // 분
		sc.close();
        
        if(M < 45) {
            H--; // 시(Hour)가 1 감소
            M = 60 - (45 - M);
            
            if(H < 0) {
                H = 23; // 0보다 작은 수가 나올 수 있기에 23
            }
            System.out.println(H + " " + M);
        }
        
        else { // (M > 45)
            System.out.println(H + " " + (M - 45));
        }
    }   
}