import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = sc.nextLine().trim().split(" ");

        if(arr[0].equals("")) { // 공백만 입력되는 경우 0 처리
            System.out.println(0);
        } else {
            System.out.println(arr.length);
        }

        sc.close();
    }
}