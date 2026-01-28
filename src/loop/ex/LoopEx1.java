package loop.ex;

public class LoopEx1 {
    /* 처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요. 이때, count라는 변수를 사용해야 합니다.
       while문, for문 2가지 버전의 정답을 만들어야 합니다.
     */
    static void main() {
        int count = 1;
        /*
            while(count <= 10){
            System.out.println(count);
            count++;
        }
        */
        for(;count<=10;count++){
            System.out.println(count);
        }
    }
}
