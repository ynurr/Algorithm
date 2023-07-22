import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        if(str.equals(sb.reverse().toString())) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
        sc.close();
    }
}

/* 
== 연산자와 equals()메소드의 가장 큰 차이점.
== 연산자는 비교하고자 하는 두개의 대상의 주소값을 비교하는데,
String클래스의 equals 메소드는 비교하고자 하는 두 개의 대상의 값 자체를 비교한다는 점이다.
equals()는 모든 객체의 부모 클래스인 Object에 정의되어있는 메소드다.
String 클래스는 위와 같이 equals()를 오버라이드하여 인자로 전달된 String의 문자열을 비교한다.

기본 타입의 int, char형등은 Call by Value 형태로
기본적으로 대상에 주소값을 가지지 않는 형태로 사용된다.
하지만 String은 일반적인 타입이 아니라 클래스다.
클래스는 기본적으로 Call by Reference 형태로 생성 시 주소값이 부여된다.
그렇기에 String타입을 선언했을 때는 같은 값을 부여하더라도 서로간의 주소값이 다른 것이다.
*/