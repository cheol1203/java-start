package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    /*
        이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum=0;
        System.out.println(n +"개의 정수를 입력하세요:");
        for(int i= 0; i< arr.length; i++){
            arr[i]= scanner.nextInt();
            sum+=arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);

    }
}
