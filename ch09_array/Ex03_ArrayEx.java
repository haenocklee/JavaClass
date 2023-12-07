package ch09_array;

import java.util.Scanner;

public class Ex03_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 3인 정수형 배열을 선언
         * 실행 했을 때 스캐너로 정수값을 입력박아 배열에 저장
         * 배열에 저장된 값의 총합, 평균 계산
         * */

        Scanner scanner = new Scanner(System.in);
        int[] numbers1 = new int[3];// numbers1의크기
        int dep = 0; //합

        for (int i = 0; i < numbers1.length; i++) {
            System.out.print("numbers1"+"["+ i +"]에 들어갈 값을 입력하세요: " );
            numbers1[i] = scanner.nextInt();
            dep = dep + numbers1[i];
        }
        System.out.println("총합: " + dep);
        System.out.println("평균: " + (double)dep / numbers1.length);
    }
}
