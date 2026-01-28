package cond.ex;

public class CondEx1 {
    /* 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자.
       다음과 같은 기준을 따른다.
       1. 90점 이상 "A"
       2. 80 점 이상, 90점 미만 "B"
       3. 70점 이상 80점 미만 "C"
       4. 60점 이상 70점 미만 "D"
       5. 60점 미만 "F"

       점수는 변수(int score)로 지정하고, 해당 변수를 기반으로 학점을 출력하자.
     */
    static void main() {
        int score = 60;

        if (score >= 90){
            System.out.println("A");
        } else if(score >= 80){
            System.out.println("B");
        } else if(score >= 70){
            System.out.println("C");
        } else if(score >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
