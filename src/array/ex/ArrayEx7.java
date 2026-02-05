package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    /*
        사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
        2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][3];
        int[] score = new int[4];
        double[] average = new double[4];
        String[] subjects = {"국어", "영어", "수학"};

        for(int i=0; i<arr.length; i++){
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            arr[i][0]= scanner.nextInt();
            System.out.print("영어 점수:");
            arr[i][1]= scanner.nextInt();
            System.out.print("수학 점수:");
            arr[i][2]= scanner.nextInt();
            for(int j = 0; j<arr[i].length; j++){
                score[i]+=arr[i][j];
            }
            average[i]=(double)score[i]/arr[i].length;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println((i+1) + "번 학생의 총점: " + score[i] + ", 평균: " + average[i]);
        }

    }
}
