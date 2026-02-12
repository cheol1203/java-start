package method;

public class MethodReturn1 {
    /*
    메서드와 조건문과 함께 사용할 때 주의
     */
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else{
            return false;
        }
    }
}
