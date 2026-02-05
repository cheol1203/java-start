package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    /*
        사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로
        그램을 작성하자. 실행 결과 예시를 참고하자.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println(n + "개의 정수를 입력하세요:");
        for(int i=0; i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
