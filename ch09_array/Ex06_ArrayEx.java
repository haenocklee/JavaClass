package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력한 값 중에서 가장 큰 값을 출력
         * */
        int[] num1 = new int[5];
        Scanner scanner = new Scanner(System.in);
        int max = 0;

        for (int i = 0; i < num1.length; i++) {
            System.out.print(i + "번 인덱스 에들어갈 값을 쓰시오: ");
            num1[i] = scanner.nextInt();
        }
        for (int i = 0; i < num1.length; i++) {
            if(max < num1[i]) {
                max = num1[i];
            }
        }
        System.out.println("최대값: " +max);
    }
}
