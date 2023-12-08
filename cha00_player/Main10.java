package cha00_player;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        /**
         * 배열을 쓸것
         * 거스름돈 계산하기
         * 필요한 거스름돈을 입력했을 때 각  지페및 동전별로 몇개가 필요한지 계산
         * ex)
         * 물건을 결재 했을때 나온 물건값 출력
         * 거스름돈이 얼마인지 출력
         * 거스름돈의 개수를 출력
         * 10000,5000,1000,500,100,50,10 각각의 개수 계산
         * */
        int[] change = {10000,5000,1000,500,50,10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("결제할 가격: ");
        int price  = scanner.nextInt();
        System.out.print("받은돈: ");
        int receive  = scanner.nextInt();
        int Changes = receive - price;
        System.out.println("잔돈: " + Changes);
        int count = 0;

        for (int i = 0; i < change.length; i++) {
            count = Changes / change[i];
            System.out.println(change[i]+ "원" + count + "개");
            Changes = Changes % change[i];
        }

    }
}
