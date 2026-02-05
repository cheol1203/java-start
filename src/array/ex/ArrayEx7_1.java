package array.ex;

import java.util.Scanner;

public class ArrayEx7_1 {
    /*
        문제 7번 더 개선하기
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for(int i=0; i<arr.length; i++){
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(subjects[j] + " 점수:");
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            int score = 0;
            for(int j = 0; j<arr[i].length; j++){
                score += arr[i][j];
            }
            double average = (double)score/arr[i].length;
            System.out.println((i+1) + "번 학생의 총점: " + score + ", 평균: " + average);

        }
    }
}
