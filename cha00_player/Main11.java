package cha00_player;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        /**
         * 크기가 3인 정수형 배열을 선언
         * 실행 했을 때 스캐너로 정수값을 입력받아 배열에 저장
         * 배열에 저장된 값의 총합, 평균 계산
         * */
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for(int i = 0; i < array.length; i++){
            System.out.print("숫자 입력 (배열 크기)번: ");
            int number1 = scanner.nextInt();
        }


    }
}
