import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[26];
        String s = sc.nextLine();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1; // -1로 모두 초기화
        }

        for(int i = 0; i < s.length(); i++) {
            // ch의 문자의 위치를 arr 배열 값으로 바꿔준다
            char ch = s.charAt(i);
            // 아스키코드 이용
            // -'a'를 하면 'a'-'a'=0, 'b'-'a'=1이 된다
            if(arr[ch-'a'] == -1) { // 처음 등장하는 위치만 출력해야 하므로 -1인 곳에만 값을 넣어준다
                arr[ch-'a'] = i;
            }
        }

        for(int var : arr) {
            System.out.print(var + " ");
        }

        sc.close();
    }
}
