package method.ex;

public class MethodEx1 {
    /*
    메서드를 잘 이해하고 있는지 확인하기 위해 다음 코드를 메서드를 사용하도록 리펙토링해보자.
     */
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        int sum = a + b + c;
//        double average = sum / 3.0;
//        System.out.println("평균값: " + average);
//
//        int x = 15;
//        int y = 25;
//        int z = 35;
//
//        sum = x + y + z;
//        average = sum / 3.0;
//        System.out.println("평균값: " + average);

        int a = 1;
        int b=  2;
        int c=  3;

        int x = 15;
        int y = 25;
        int z = 35;

        solve(a,b,c);
        solve(x,y,z);
    }

    public static void solve(int a, int b, int c){
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
    }
}
