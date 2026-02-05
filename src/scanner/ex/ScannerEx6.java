package scanner.ex;

import java.util.Scanner;

public class ScannerEx6 {
    /*
        사용자로부터 두 개의 정수를 입력받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하세요.
        1. 사용자에게 첫 번째 숫자를 입력받으세요. 변수의 이름은 num1이어야 합니다.
        2. 사용자에게 두 번째 숫자를 입력받으세요. 변수의 이름은 num2이어야 합니다.
        3. 만약 첫 번째 숫자 num1이 두 번째 숫자 num2보다 크다면, 두 숫자를 교환하세요.
        4. num1부터 num2까지의 각 숫자를 출력하세요.
        5. 출력 결과에 유의하세요. 다음 예시와 같이 2,3,4,5처럼 ,로 구분해서 출력해야 합니다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        if(num1>num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("두 숫자 사이의 모든 정수:");
        for(int i = num1; i<=num2; i++){
            if(i==num1){
                System.out.print(i);
            }else{
                System.out.print(","+i);
            }
        }

    }
}
