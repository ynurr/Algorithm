import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
         
        String ascii = sc.next(); // 입력값을 String 저장
		int ch = ascii.charAt(0); 
        // 아스키코드는 정수형이므로 
        // 변수 ascii에서 0번째(첫 번째) 문자를 int 형식의 ch에 집어넣는다.
        
		System.out.print(ch);
	}
}