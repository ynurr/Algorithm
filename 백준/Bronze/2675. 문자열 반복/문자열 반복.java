import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

	for(int i = 0; i < t; i++) {
            int r = sc.nextInt();
	    String s = sc.next(); // 공백으로 분리하기 때문에 next()

            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < r; k++) { // r만큼 반복 출력
                    System.out.print(s.charAt(j));
                }
            }
        
            System.out.println();

        }

        sc.close();
    }
}
