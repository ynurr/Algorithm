import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int arr[] = new int[26]; // 영문자 개수 26개

        for(int i = 0; i < s.length(); i++){
            // 십진수 이용하여 인덱스 계산
            // ex) 대문자 C를 입력받았을 때, 배열의 세 번째 원소인 2를 도출하려면 C=67 이므로 65를 빼주면 된다.
            // 67-65 = 2, 소문자 e는 101-97 = 4
            // 문자로 빼줘도 된다. 'A' <= s.charAt(i) && s.charAt(i) <= 'Z'
            if(65 <= s.charAt(i) && s.charAt(i) <= 90) { // 대문자 범위
                arr[s.charAt(i)-65]++; // 해당 인덱스의 값 1 증가
                // 65 대신 문자로 빼줘도 된다. s.charAt(i)-'A'
            } else { // 소문자 범위
                arr[s.charAt(i)-97]++;
            }
        }

        int max = -1; // 최대값 비교를 위한 -1
        char ch = '?';

        for(int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 출력해야 하므로 65를 더해준다.
            } else if(arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);

        sc.close();
    }
}