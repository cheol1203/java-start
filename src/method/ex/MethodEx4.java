package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    /* 은행 계좌 입출금
    1. 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자.
    2. 또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자
    3. 출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while(true){
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택: ");
            int n = scanner.nextInt();

            /*
                더 좋은 답 : depositAmount와 , withdrawAmount를 따로 분리 안하고 amount 변수하나로 통합해도 됨
             */
            if(n==1){
                System.out.print("입금액을 입력하세요: ");
                int depositAmount = scanner.nextInt();
                balance = deposit(balance, depositAmount);
            } else if(n==2){
                System.out.print("출금액을 입력하세요: ");
                int withdrawAmount = scanner.nextInt();
                balance = withdraw(balance, withdrawAmount);
            } else if(n==3){
                System.out.println("현재 잔액: " + balance + "원");
            } else if(n==4){
                System.out.println("시스템을 종료합니다.");
                break;
            }


        }
    }

    public static int deposit(int balance, int depositAmount){
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount){
        if(balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }else{
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
