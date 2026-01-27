package operator;

public class Operator1 {
    static void main() {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // 10

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // 2

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 1
    }
}
