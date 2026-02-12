package method.ex;

import java.util.Scanner;

public class MethodEx2 {
    /*
    다음은 특정 숫자만큼 같은 메시지를 반복 출력하는 기능이다.
    메서드를 사용해서 리펙토링해보자.
     */
    public static void main(String[] args) {
//        String message = "Hello, world!";
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println(message);
//        }

        String message = "Hello, world";
        Scanner scanner = new Scanner(System.in);
        System.out.print("반복할 횟수를 입력하시오.: ");
        int a = scanner.nextInt();
        solve(message, a);
    }

    public static void solve(String message, int a){
        for (int i = 0; i < a; i++){
            System.out.println(message);
        }
    }
}
