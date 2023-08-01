import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[][] arr = new char[5][15];
        String str = "";

        for(int i = 0; i < arr.length; i++) {
            str = sc.nextLine(); // 문자열 입력 받음

            for(int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j); // 한 글자씩 배열에 넣어준다
            }
        }

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(arr[j][i] == ' ' || arr[j][i] == '\0') { // 참조한 인덱스가 공백 또는 null 문자일 경우 넘어간다
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }
        
        sc.close();
    }
}